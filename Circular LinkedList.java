class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class CircularLinkedlist
{
    Node head=null;
    void insertAtBeginning(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            newNode.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            newNode.next=head;
            temp.next=newNode;
            head=newNode;
        }
    }
    void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            newNode.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }
    void insertAtPosition(int data,int pos)
    {
        Node newNode=new Node(data);
        if(pos==1)
        {
            insertAtBeginning(data);
            return;
        }
        Node temp=head;
        int count=1;
        while(count<pos-1 && temp.next!=head)
        {
            temp=temp.next;
            count++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void deleteFromBeginning()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==head)
        {
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            head=head.next;
            temp.next=head;
        }
    }
    void deleteFromEnd()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==head)
        {
            head=null;
        }
        else
        {
            Node temp=head;
            while(temp.next.next!=head)
            {
                temp=temp.next;
            }
            temp.next=head;
        }
    }
    void deleteAtPosition(int pos)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(pos==1)
        {
            deleteFromBeginning();
            return;
        }
        Node temp=head;
        int i=1;
        while(i<pos-1&&temp.next.next!=head)
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("(Back to head)");
    }
    public static void main(String args[])
    {
        CircularLinkedlist list=new CircularLinkedlist();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.println("Original List: ");
        list.display();
        list.insertAtPosition(15,2);
        System.out.println("After inserting 15 at Position 2 : ");
        list.display();
        list.deleteAtPosition(3);
        System.out.println("After deleting Position 3 :");
        list.display();
    }
}
