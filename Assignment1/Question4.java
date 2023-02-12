import java.util.*;
class Question4_1
{
    static Scanner s=new Scanner(System.in);
    public int id;

    public void inputValues(int n,List<Object> l,HashMap<Integer,List> h,List<String> prod)
    {
        System.out.println("Enter the Product Details: ");
        for(int i=0;i<n;i++)
        {
            int Pid=s.nextInt();
            String Pname=s.next();
            int Pcost=s.nextInt();
            int Pcount=s.nextInt();
            l.add(Pname);
            l.add(Pcost);
            l.add(Pcount);

            h.put(Pid,new ArrayList<Object>(l));
            l.clear();
            prod.add(Pname);
        }
    }
    public void viewProduct(List<String> l)
    {
        System.out.println("The Product are:\n***************");
        for(int i=0;i<l.size();i++)
            System.out.println((i+1)+" "+l.get(i));
    }
    public void viewProductCount(List<Object>l,HashMap<Integer,List>h,int id)
    {
       this.id=id;
        System.out.println("The count  is: "+h.get(id).get(2));
    }
    public void viewProductDetails(HashMap<Integer,List> h,int id)
    {
        this.id=id;
        System.out.println("Product_Name \t Product_cost \t Product_count");
        System.out.println("\t"+h.get(id).get(0)+"\t\t"+h.get(id).get(1)+"\t\t"+h.get(id).get(2));
    }
    public void updateValue(HashMap<Integer,List>h,int id)
    {

       this.id=id;
        System.out.println("Enter the value need to be updated: ");
        int val=s.nextInt();
       List<Object> l=new ArrayList<Object>();
       l.add(h.get(id).get(0));
       l.add(val);
      l.add(h.get(id).get(1));
      h.replace(id,l);


        System.out.println("The updated value is:");
        System.out.println("Product_Name \t Product_cost \t Product_count");
        System.out.println("\t"+h.get(id).get(0)+"\t\t"+h.get(id).get(1)+"\t\t"+h.get(id).get(2));
    }
    public void AddDelete(HashMap<Integer,List>h)
    {
       while(true)
       {
            System.out.println("\n Select an option\n ***************" );
            System.out.println("1. Add Count\n2. Delete Count\n3. Exit...");
            int n=s.nextInt();
            switch(n)
            {
                case 1:
                         System.out.println("Enter the Product id ");
                        int id4=s.nextInt(); 
                        AddCount(h,id4);
                        break;
                case 2:
                        System.out.println("Enter the Product id ");
                        int id5=s.nextInt(); 
                        DeleteCount(h,id5);
                        break;
                case 3:
                        break;
                default:
                    System.out.println("Enter valid option");
                    break;
            }
            if(n==3)
                break;
       }
        
    }
    public void AddCount(HashMap<Integer,List>h,int id)
    {
       this.id=id;
        System.out.println("Enter the count to be added:");
        int c=s.nextInt();
        List<Object> l=new ArrayList<Object>();
        l.add(h.get(id).get(0));
         l.add(h.get(id).get(1));
        int x=(int)h.get(id).get(2);
        x+=c;
         l.add(x);
          h.replace(id,l);
         System.out.println("After Adding the count: ");
         System.out.println("Product_Name \t Product_cost \t Product_count");
        System.out.println("\t"+h.get(id).get(0)+"\t\t"+h.get(id).get(1)+"\t\t"+h.get(id).get(2));
    }
     public void DeleteCount(HashMap<Integer,List>h,int id)
    {
        this.id=id;
        System.out.println("Enter the count to be deleted:");
        int c=s.nextInt();
        List<Object> l=new ArrayList<Object>();
        l.add(h.get(id).get(0));
         l.add(h.get(id).get(1));
         int x=(int)h.get(id).get(2);
        x-=c;
         l.add(x);
          h.replace(id,l);
         System.out.println("After deleting the count: ");
         System.out.println("Product_Name \t Product_cost \t Product_count");
        System.out.println("\t"+h.get(id).get(0)+"\t\t"+h.get(id).get(1)+"\t\t"+h.get(id).get(2));
    }

}

class Question4
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Question4_1 obj=new Question4_1();
        System.out.println("\nEnter Number of products\n************************");
        int n=s.nextInt();
        List<Object> l=new ArrayList<Object>();
        List<String> products=new ArrayList<String>();

        HashMap<Integer,List> h=new HashMap<>();
        obj.inputValues(n,l,h,products);
        
        while(true)
        {

            System.out.println("\n\nSelect a number: \n******************");
            System.out.println("1. View Product List \n2. View Product Count\n3. View Product Details \n4. Update Product Details\n5. Add/Delete Product Quantities\n6. Exit...");
            int x=s.nextInt();
            switch(x)
            {

                 case 1: 
                        obj.viewProduct(products);
                        break;
                case 2:
                        System.out.println("Enter the Product id :");
                        int id1=s.nextInt();
                        obj.viewProductCount(l,h,id1);
                        break;
                case 3: 
                        System.out.println("Enter the Product id ");
                        int id2=s.nextInt();
                        obj.viewProductDetails(h,id2);
                        break;
                case 4:
                         System.out.println("Enter the Product id : ");
                        int id3=s.nextInt();
                        obj.updateValue(h,id3);
                        break;
                case 5:
                        obj.AddDelete(h);
                        break;
                case 6:
                        break;
            }
            if(x==6)
                break;

        }
    }
}