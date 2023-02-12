import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class Question3
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the Linked list");
        int s1=s.nextInt();
        Node st=null,t=null;
        for(int i=0;i<s1;i++)
        {
            int d=s.nextInt();
            Node n=new Node(d);
            if(h==null)
            {
                st=n;
                t=n;
            }
            else
		{
                t.next=n;
                t=t.next;
            }
        }
        Node res=null,temp=null;

        ArrayList<Integer> list=new ArrayList<>();
        while(h!=null)
        {
            if(!list.contains(st.data))
            {
                list.add(st.data);
                Node n=new Node(st.data);
                if(rs==null)
                {
                    rs=n;
                    temp=n;
                }
                else{
                    temp.next=n;
                    temp=n;
                }sss
            }
            st=st.next;
        }
        while(res!=null)
        {
            System.out.print(rs.data+" ");
            rs=rs.next;
        }
        s.close();
    }
}