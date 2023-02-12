import java.util.*;
class Question1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=s.nextInt();
        int maxi=arr1[0];
        for(int j=0;j<n;j++)
        {
            if(arr1[j]>maxi)
                maxi=arr1[j];

        }
        int arr2[]=new int[maxi];
        for(int i=0;i<n;i++)
        {
            arr2[arr1[i]-1]=arr1[i];
        }
        for(int i=0;i<maxi;i++)
        {
            if(arr2[i]==0)
                System.out.print(i+1+" ");
        }
    }
}