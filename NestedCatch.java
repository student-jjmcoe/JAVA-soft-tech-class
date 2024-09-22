class NestedCatch
   {
       public static void main(String[]arg)
          {
                int x=10;
                int y=0;
                int[] a= {10,20,30,40};
                float z;

                try
                {   z = x/y;
                        System.out.println(z);
                    
                    try
                    {
                        System.out.println(a[1]);
                    
                    }
                    catch(ArrayIndexOutOfBoundsException e)
                   {
                        System.out.println(e);
                        System.out.println("Wron Index");
                   }
               }
                catch(ArithmeticException e)
                {
                   System.out.println(e);
                   System.out.println("Do not divide by zero");
                }
           }
    }   
         