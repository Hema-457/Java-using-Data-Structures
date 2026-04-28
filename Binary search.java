class Main{
    public static void main(String args[])
    {
        int []arr={10,20,30,40,50,60};
        int key=50;
        int position=-1;
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                position=mid;
                break;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
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
