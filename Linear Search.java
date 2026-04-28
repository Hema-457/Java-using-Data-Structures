class Main{
    public static void main(String args[])
    {
        int []arr={10,20,30,40,50,60};
        int key=30;
        int position=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==key)
            {
                position=i;
                break;
            }
        }
        if(position!=-1)
        {
            System.out.println("Element found at Index: "+position);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
