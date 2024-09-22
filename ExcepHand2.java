class ExcepHand2
   {
       public static void main(String[]arg)
          {
              int[] a = {10,20,30,40};
              
              try
              {
                 System.out.println(a[10]);
              }
              catch(Exception e)
              {
                  System.out.println(e);
                  System.out.println("Bad Index");
              }
              finally
              {
                  System.out.println("Rest of the Code");
          }
     }
  }