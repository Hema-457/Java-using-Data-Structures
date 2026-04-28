import java.util.Stack;
 class QueueusingStacks
 {
     Stack<Integer> stack1 = new Stack<>();
     Stack<Integer> stack2 = new Stack<>();
       void enqueue(int data)
       {
           stack1.push(data);
           System.out.println(data + "inserted");
       }
       void dequeue()
       {
           if(stack1.isEmpty() && stack2.isEmpty())
           {
               System.out.println("queue is empty");
               return;
           }
           if(stack2.isEmpty())
           {
               while(!stack1.isEmpty())
               {
                   stack2.push(stack1.pop());
               }
           }
           System.out.println(stack2.pop());
       }
       void display()
       {
           if(stack1.isEmpty() && stack2.isEmpty())
           {
               System.out.println("queue is empty");
               return;
       }
       System.out.println("Queue elements: ");
       for (int i=stack2.size()-1;i>=0;i--)
       {
           System.out.print(stack2.get(i) + " ");
       }
           for (int i=0;i<stack1.size();i++)
           {
               System.out.print(stack1.get(i) + " ");
           }
           System.out.println();
       }
    }
public class Main 
{
    public static void main(String[]args)
    {
        QueueusingStacks q = new QueueusingStacks();
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        q.display();
        
        q.dequeue();
        q.dequeue();
        
        q.display();
    }
}             
