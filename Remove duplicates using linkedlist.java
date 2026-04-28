class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
 class Main
{
    Node head;
    void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void removeDuplicates()
    {
        Node current=head;
        while(current!=null)
        {
            Node temp=current;
            while(temp.next!=null)
            {
                if(temp.next.data==current.data)
                {
                    temp.next=temp.next.next;
                }
                else{
                    temp=temp.next;
                }
            }
            current=current.next;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        Main list=new Main();
        list.insert(10);
        list.insert(20);
        list.insert(20); 
        list.insert(30);
        list.insert(10);
        list.removeDuplicates();
        list.display();
    }
}
