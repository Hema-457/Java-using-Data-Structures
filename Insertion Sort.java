class Main{
    public static void main(String args[])
    {
    int arr[]={69,21,38,29,16,22};
    for(int i=0;i<arr.length-1;i++)
    {
        int key=arr[i];
        int j=i-1;
        while(j>=0&&arr[j]>key)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    for(int x:arr)
    {
        System.out.print(x+" ");
    }
    
    }
}
