class MultiCatch2
   {
       public static void main(String[]arg)
          {
                int x=10;
                int y=2;
                float z;
                int[] a= {10,20,30,40};

                try
                {   System.out.println(a[10]);
                    z = x/y;                   
                    System.out.println(z);
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                   System.out.println(e);
                   System.out.println("Wrong Index");
                }
                catch(ArithmeticException e)
                {
                   System.out.println(e);
                   System.out.println("Do not divide by zero");
                }
           }
    }   
         