class OddException extends Exception
   {
       OddException(String msg)
       {
           super(msg);
       }
   }
class OddException2
   {
       public static void main(String[]arg)
         {
             int n= 11;
             try
             {
               if(n%2==0)
                  System.out.println("Even");
               else
                {
                  OddException x = new OddException("Odd Number");
                  throw x;
                }
            }
            catch(OddException e)
            {
               System.out.println(e);
            }
         }
    }