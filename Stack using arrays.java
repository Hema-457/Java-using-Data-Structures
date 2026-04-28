// Stack using Arrays
class StackArray
{
    int maxSize;
    int[] stack;
    int top;
    // constructor 
    StackArray(int size)
    {
        maxSize=size;
        stack = new int[maxSize];
        top=-1;
    }
    void push(int value)
    {
        if(top==maxSize-1)
        {
            System.out.println("stack is overflow");
        }
        else
        {
           stack[++top]=value;
           System.out.println(value + "pushed into stack");
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow");
        }
        else{
            System.out.println(stack[top--] + "popped into stack");
        }
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            System.out.println("Top element: " + stack[top]);
        }
    }
    boolean isEmpty()
      {
        return top == -1;
    }
    boolean isFull()
    {
        return top == maxSize-1;
    }
}
public class Main 
{ 
    public static void main(String[]args)
    {
        StackArray s = new StackArray(5);
        
        s.push(10);
        s.push(20);
        s.push(30);
        
        s.peek();
        
        s.pop();
        s.pop();
       
        
        s.peek();
        
    }
}
