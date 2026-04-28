import java.util.Scanner;
class ParenthesisMatch
{
    char stack[];
    int top=-1;
    int size;
    ParenthesisMatch(int n)
    {
        size=n;
        stack=new char[size];
    }
    void push(char ch)
    {
        top++;
        stack[top]=ch;
    }
    char pop()
    {
        char ch = stack[top];
        top--;
        return ch;
    }
    boolean isEmpty()
    {
    return top==-1;
    }
    boolean checkMatch(char open,char close)
    {
        if(open =='(' && close==')')
        {
            return true;
        }
        if(open =='{' && close=='}')
        {
            return true;
        }
        if(open =='[' && close==']')
        {
            return true;
        }
        return false;
    }
    boolean balanced(String exp)
    {
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            if(ch =='(' || ch =='{' || ch == '[')
            {
                push(ch);
            }
            else if(ch ==')' || ch =='}' || ch == ']')
            {
                if(isEmpty())
                {
                    return false;
                }
                char open=pop();
                if(!checkMatch(open,ch))
                {
                    return false;
                }
            }
        }
        return isEmpty();
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Expression:");
        String exp=s.nextLine();
        ParenthesisMatch obj=new ParenthesisMatch(exp.length());
        if(obj.balanced(exp))
        {
            System.out.println("Parenthesis are Balanced");
        }
        else{
            System.out.println("Parenthesis are Not Balanced");
        }
    }
}

