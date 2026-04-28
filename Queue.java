class QueueArray
{
    int size;
    int front,rear;
    int arr[];
QueueArray(int size)
{
    this.size=size;
    front=-1;
    rear=-1;
    arr=new int[size];
}
boolean isEmpty()
{
    return(front==-1||front>rear);
}
boolean isFull()
{
    return (rear==size-1);
}
void enqueue(int data)
{
    if(isFull())
    {
        System.out.println("Queue is Full");
        return;
    }
    if(front==-1)
    {
        front=0;
    }
    rear++;
    arr[rear]=data;
    System.out.println(data + "inserted");
}
void dequeue()
{
    if(isEmpty())
    {
        System.out.println("Queue is Empty");
        return;
    }
    System.out.println(arr[front]+"removed");
    front++;
}
void display()
{
    if(isEmpty())
    {
        System.out.println("Queue is Empty");
        return;
    }
    System.out.println("Queue Elements");
    for(int i=front;i<=rear;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}
public class Main
{
    public static void main(String args[])
    {
        QueueArray q=new QueueArray(5);
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
