import java.util.PriorityQueue;
public class Main
    {
        public static void main(String args[])
        {
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            pq.add(10);
            pq.add(6);
            pq.add(30);
            pq.add(56);
            System.out.println("Queue Elements: "+ pq);
            System.out.println("Removed : "+ pq.poll());
            System.out.println("Top Element : "+ pq.peek());
        }
    }
