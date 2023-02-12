import java.util.*;
class Question1
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=inp.nextInt();
        int sum[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
            sum[i]=s;
        }
        for(int i: sum)
        System.out.print(i+" ");
        System.out.println();
        inp.close();
    }
}