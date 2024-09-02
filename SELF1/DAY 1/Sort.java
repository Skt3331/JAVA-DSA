class Sort
{
    public static void buublesort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
        }   
    }
   public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }


    public static void insertionSort(int arr[])
    {
        for(int i=1<arr.length;i++)
        {
            int cuu=arr[i];
            int key=i-1;
            while(key>=0 && arr[key]>cuu)
            {
                arr[key+1]=arr[key];
                 key--;
            }
            arr[key+1]=cuu;
        }
    }
    public static void printarr(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i+" ");

        }
    }
    public static void main(String[] args)
    {
        int[] arr = {10, 5, 3, 1, 2, 4, 8, 7, 6, 9};     
        // buublesort(arr);   
        // selectionSort(arr);
        insertionSort(arr);

        printarr(arr);
           
}
}