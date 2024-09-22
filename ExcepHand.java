class ExcepHand
    {
       public static void main(String[]arg)
       {
        int a,b;
        float c;
        a=10;
        b=0;

       try{
             c = a/b;
             System.out.println(c);
          }
      catch(ArithmeticException e)
          {
             System.out.println(e);
             System.out.println("Don't Divide by Zero");
          }
     finally
          {
              System.out.println("Rest of the Code");
          }
     }
  }