class FailException extends Exception
    {
       FailException(String msg) 
       {
           super(msg);
       }
    }
class FailException2
    {
       public static void main(String[]arg)
         {
             int marks = 34;
             try
             {
               if(marks > 35)
                 System.out.println("Pass");
               else
                 {
                    FailException x = new FailException("Student is fail");
                    throw x;
                 } 
             }
             catch(FailException e)
             {
                 System.out.println(e);
             }
         }
    }