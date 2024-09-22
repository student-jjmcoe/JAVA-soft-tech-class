class NegativeException extends Exception
   {
       NegativeException(String msg)
          {
               super(msg);
          }
   }
class NegativeException2
   {
        public static void main(String[]arg)
          {
                int n=-10;
                try
                {
                    if(n>0)
                      System.out.println("Positive");
                    else
                    {
                      NegativeException x = new NegativeException("Negative no.");
                      throw x;
                    }
                 }
                 catch(NegativeException x)
                 {
                      System.out.println(x);
                 }
         }
    }