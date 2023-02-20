import java.util.*;
class main
{
   static class Node
    {
        int value;
        Node next;
       
        Node(int val)
        {
            this.value=val;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        Node start;
        start = convertToLinkedList(arr);
        printLinkedList(start);
    }


    public static void printLinkedList(Node start){
        if(start == null){
            System.out.println("no elements are present");
            return;
        }
        Node temp=start;
      
        while(temp.next!=start)
        {
            System.out.println(temp.value+" ");
           temp = temp.next;
        }
        System.out.println(temp.value);
         System.out.println();
    }


    public static Node convertToLinkedList(int[] arr){
        Node temp=null;
        Node start=temp;
        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            if(i==0)
            {
                temp=new Node(val);
                temp.next=start;
                start=temp;
            }
            else{
                temp.next=new Node(val);
                temp =temp.next;
                temp.next=start;
            }
        }
        

        return start;
    }

  
}