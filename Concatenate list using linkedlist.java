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
    void concatenate(Main list2)
    {
        if(head==null)
        {
            head=list2.head;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=list2.head;
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
        Main list1=new Main();
        list1.insert(10);
        list1.insert(20);
       
        Main list2=new Main();
        list2.insert(30);
        list2.insert(40);
        list1.concatenate(list2);
        list1.display();
    }
}
