import java.util.*;
class Question2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++)
            arr[i]=sc.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
             System.out.print(e.getKey()+" ");
        }
        
    }
}