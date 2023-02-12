import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
       data=d;
        next=null;
    }
}
class Question2 
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Linkedlist-1");
        int s1=s.nextInt();
        Node h1=null,t1=null,h2=null,t2=null;
        ArrayList<Integer> lt=new ArrayList<>();
        for(int i=0;i<s1;i++)
        {
            int d=s.nextInt();
            Node n=new Node(d);
            lt.add(n.data);
            if(h1==null)
            {
                h1=n;
                t1=n;
            }
            else
            {
                t1.next=n;
                t1=n;
            }
        }
        System.out.println("Enter the size of Linkedlist 2");
        int s2=s.nextInt();
        for(int i=0;i<s2;i++)
        {
            int d=s.nextInt();
            Node n=new Node(d);
            lt.add(n.data);
            if(h2==null)
            {
                h2=n;
                t2=n;
            }
            else
            {
                t2.next=n;
                t2=n;
            }
        }
        Collections.sort(lt);
        Node res=null,t=null;
        for(int a: lt)
        {
            Node n=new Node(a);
            if(res==null)
            {
                res=n;
                t=n;
            }
            else
            {
                t.next=n;
                t=n;
            }
        }
        while(res!=null)
        {
            System.out.print(res.data+" ");
            res=res.next;
        }
        s.close();
    }
}
