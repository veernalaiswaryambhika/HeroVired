import java.util.*;
class Question3
{
    static Scanner sc=new Scanner(System.in);
    public static void inputValues(int n,List<Object> l,HashMap<Integer,List> h,List<String> prod)
    {
        System.out.println("Enter the  Product Details: ");
        for(int i=0;i<n;i++)
        {
            int Pid=sc.nextInt();
            String Pname=sc.next();
            int Pcost=sc.nextInt();
            int Pcount=sc.nextInt();
            l.add(Pname);
            l.add(Pcost);
            l.add(Pcount);
            h.put(Pid,new ArrayList<Object>(l));
            l.clear();
            prod.add(Pname);
        }
    }
    public static void viewProducts(List<String> l)
    {
        System.out.println("The Product List is:\n********************");
        for(int i=0;i<l.size();i++)
            System.out.println((i+1)+" "+l.get(i));
    }
    public static void viewProductCount(List<Object>l,HashMap<Integer,List>h)
    {
        System.out.println("Enter the Product id  :");
        int id=sc.nextInt();
        System.out.println("The count of the product is: "+h.get(id).get(2));
    }
    public static void viewProductDetails(HashMap<Integer,List> h)
    {
        System.out.println("Enter the Product id:");
        int id=sc.nextInt();
        System.out.println("Product_Name \t Product_cost \t Product_count");
        System.out.println("\t"+h.get(id).get(0)+"\t\t"+h.get(id).get(1)+"\t\t"+h.get(id).get(2));
    }
    public static void updateValue(HashMap<Integer,List>h)
    {
        System.out.println("Enter the Product id  : ");
        int id=sc.nextInt();
        System.out.println("Enter the value need to be updated: ");
        int val=sc.nextInt();
       List<Object> l=new ArrayList<Object>();
       l.add(h.get(id).get(0));
       l.add(val);
      l.add(h.get(id).get(1));
      h.replace(id,l);


        System.out.println("The updated value  is:");
        System.out.println("Product_Name \t Product_cost \t Product_count");
        System.out.println("\t"+h.get(id).get(0)+"\t\t"+h.get(id).get(1)+"\t\t"+h.get(id).get(2));
    }
    public static void AddDelete(HashMap<Integer,List>h)
    {
       while(true)
       {
            System.out.println("\n Select an option\n ******************" );
            System.out.println("1. Add Count\n2. Delete Count\n3. Exit...");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                        AddCount(h);
                        break;
                case 2:
                        DeleteCount(h);
                        break;
                case 3:
                        break;
                default:
                    System.out.println("Enter proper  option");
                    break;
            }
            if(n==3)
                break;
       }  
    }
    public static void AddCount(HashMap<Integer,List>h)
    {
        System.out.println("Enter the Product id ");
        int id=sc.nextInt(); 
        System.out.println("Enter the count to be added:");
        int c=sc.nextInt();
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
     public static void DeleteCount(HashMap<Integer,List>h)
    {

        System.out.println("Enter the Product id ");
        int id=sc.nextInt(); 
        System.out.println("Enter the count to be deleted:");
        int c=sc.nextInt();
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
    public static void main(String args[])
    {
        
        System.out.println("\nEnter Number of products\n**************************");
        int n=sc.nextInt();
        List<Object> l=new ArrayList<Object>();
        List<String> products=new ArrayList<String>();

        HashMap<Integer,List> h=new HashMap<>();
        inputValues(n,l,h,products);
        while(true)
        {
            System.out.println("\n\nSelect a number: \n***************");
            System.out.println("1. View Product List \n2. View Product Count\n3. View Product Details \n4. Update Product Details\n5. Add/Delete Product Quantities\n6. Exit...");
            int val=sc.nextInt();
            switch(val)
            {
                 case 1: 
                        viewProducts(products);
                        break;
                case 2:
                        viewProductCount(l,h);
                        break;
                case 3: 
                        viewProductDetails(h);
                        break;
                case 4:
                        updateValue(h);
                        break;
                case 5:
                        AddDelete(h);
                        break;
                case 6:
                        break;
            }
            if(val==6)
                break;
        }
    }
}