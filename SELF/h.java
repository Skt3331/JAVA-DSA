public class h {

    // //Linear search
    // public static int lsearch(int a[],int key)
    // {
    // for(int i=0;i<a.length;i++)
    // {
    // if(a[i]==key)
    // {
    // return i;
    // }
    // }
    // return -1;
    // }

    // //largest in arrray
    // public static int largest(int[] a)
    // {
    // int large=0;
    // for(int i=0;i<a.length;i++)
    // {
    // large= a[i]>large ? a[i]:large;
    // }
    // return large;
    // }
    // //binary search
    // public static int binary(int[] a,int key)
    // {
    // int start=0;
    // int end=a.length;
    // while(start<end)
    // {
    // int mid=(start+end)/2;
    // if(a[mid]==key)
    // {
    // return key;
    // }
    // else if(key>a[mid])
    // {
    // start=mid+1;
    // }
    // else
    // {
    // end=mid-1;
    // }

    // }
    // return -1;
    // }

    // //Reverse an array
    // public static int[] Reverse(int b[])
    // {

    // int start=0,end=b.length-1;
    // while(start<end)
    // {
    // int temp=b[start];
    // b[start]=b[end];
    // b[end]=temp;
    // start++;
    // end--;
    // }
    // return b;
    // }
    // //pairs in a array
    // public static void pairs(int[] a)
    // {
    // for(int i=0;i<a.length;i++)
    // {
    // for(int j=0;j<a.length;j++)
    // {
    // System.out.print("("+a[i]+","+a[j]+")");
    // }
    // System.out.println();
    // }
    // }
    // // print all subarray
    // public static void subarray(int [] a)
    // {
    // for(int i=0;i<a.length+1;i++)
    // {

    // for(int j=1;j<a.length+1;j++)
    // {
    // for(int k=i;k<j;k++)
    // {
    // System.out.print(a[k]+" ");
    // }
    // System.out.print("\n");
    // }
    // System.out.println();
    // }

    // }
    // //maximum subarray sum
    // public static int maximusum(int[] a)
    // {
    // int max=Integer.MIN_VALUE;
    // int suma=0;
    // for(int i=0;i<a.length+1;i++)
    // {
    // for(int j=1;j<a.length+1;j++)
    // {
    // for(int k=i;k<j;k++)
    // {
    // suma=suma+a[k];

    // }
    // max=suma>max? max=suma:max;
    // suma=0;
    // }
    // }
    // return max;
    // }
    // //maximum subarray sum (pefix sum);
    // public static void subsump(int[] a)
    // {
    // int csum=Integer.MIN_VALUE;
    // int msum=Integer.MIN_VALUE;
    // int[] prefixsum=new int[a.length];
    // prefixsum[0]=a[0];
    // for(int i=1;i<a.length;i++)
    // {
    // prefixsum[i]=prefixsum[i-1]+a[i];
    // }
    // for(int i=0;i<prefixsum.length;i++)
    // {
    // for(int j=i;j<prefixsum.length;j++)

    // {for(int k=i;k<j;k++)
    // {
    // csum=i==0?prefixsum[j]:prefixsum[j]-prefixsum[i-1];
    // System.out.println(csum);
    // if(csum>msum)
    // {
    // msum=csum;
    // }
    // }
    // }
    // }
    // System.out.println(msum);
    // }
    // kadans subarray sum
    // public static int ksum(int[] a)
    // {
    // int csum=0;
    // int msum=0;
    // for(int i=0;i<a.length;i++)
    // {
    // csum=csum+a[i];
    // if(csum<0)
    // {
    // csum=0;
    // }
    // msum=Math.max(csum,msum);
    // }
    // return msum;
    // }
    // trapping rain water
    public static int waters(int[] a) {
        int[] lmb = new int[a.length];
        int[] rmb = new int[a.length];
        // calculate left max boundry
        lmb[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            lmb[i] = Math.max(a[i], lmb[i - 1]);
        }
        // calculate right max boundry
        rmb[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            rmb[i] = Math.max(a[i], lmb[i + 1]);
        }
        int tw = 0;
        for (int i = 0; i < a.length; i++) {
            int water = Math.min(lmb[i], rmb[i]);
            tw += water - a[i];
        }
        return tw;
    }

    public static void main(String args[]) {
        int[] a = { 1, 3, 5, 4, 8, 2, 8 };
        // System.out.println(lsearch(a, 78));
        // System.out.println(largest(a));
        // System.out.println(binary(a, 7));
        // for(int b:Reverse(a))
        // {
        // System.out.print(b+",");
        // }
        // pairs(a);
        // subarray(a);
        // System.out.println(maximusum(a));
        // subsump(a);
        // System.out.println(ksum(a));
        // System.out.println(waters(a));
    }

}
