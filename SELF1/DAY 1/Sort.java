class Sort
{
    public static void buublesort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j]>arr[i])
            {
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=arr[i];

            }
        }
        }   
    }
    public void printarr(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i+" ");

        }
    }
    public static void main(String[] args)
    {
        int[] arr = {10, 5, 3, 1, 2, 4, 8, 7, 6, 9};     
        buublesort(arr);
        printarr(arr);
           
}
}