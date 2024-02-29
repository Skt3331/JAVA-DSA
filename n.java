public class n {
    // /////////////////////////////////////////// murge sort divide and conquer
    // public static void margesort(int[] a, int si, int ei) {
    // if (si >= ei) {
    // return;
    // }
    // int mid = si + (ei - si) / 2;
    // margesort(a, si, mid);
    // margesort(a, mid + 1, ei);

    // marge(a, si, mid, ei);

    // }

    // public static void marge(int a[], int si, int mid, int ei) {
    // int[] ae = new int[ei - si + 1];
    // int i = si;
    // int j = mid + 1;
    // int k = 0;
    // while (i <= mid && j <= ei) {
    // if (a[i] < a[j]) {
    // ae[k] = a[i];
    // i++;
    // } else {
    // ae[k] = a[j];
    // j++;
    // }
    // k++;
    // }
    // while (i <= mid) {
    // ae[k++] = a[i++];
    // }
    // while (j <= ei) {
    // ae[k++] = a[j++];
    // }
    // for (k = 0, i = si; i < ae.length; k++, i++) {
    // a[i] = ae[k];
    // }
    // }

    public static void pri(int a[]) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    ///////////////////////////////////// Quick sort on pivot'
    public static void quicksort(int[] a, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = partision(a, si, ei);
        quicksort(a, si, pidx - 1);
        quicksort(a, pidx + 1, ei);
    }

    public static int partision(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    ///////////////////////////////////////////// sorted and rotated array
    public static int sortedrotated(int[] a, int tar, int si, int ei) {
        if (si > ei)
            return -1;
        // kaam
        int mid = si + (ei - si) / 2;
        if (a[mid] == tar) {
            return mid;
        }
        // mid on left
        if (a[si] <= a[mid]) {
            if (a[si] <= tar && tar <= a[mid]) {
                return sortedrotated(a, tar, si, mid - 1);
            } else {
                return sortedrotated(a, tar, mid + 1, ei);
            }
        } else {
            if (a[mid] <= tar && tar <= a[ei]) {
                return sortedrotated(a, tar, mid + 1, ei);
            } else {
                return sortedrotated(a, tar, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int[] a = { 4, 5, 6, 7, 1, 2, 3 };
        // margesort(a, 0, a.length - 1);
        // pri(a);
        // quicksort(a, 0, a.length - 1);
        // pri(a);
        System.out.println(sortedrotated(a, 2, 0, a.length - 1));
    }
}
