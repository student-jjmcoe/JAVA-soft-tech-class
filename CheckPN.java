class CheckPN
   {
       int n;
       public void getData(int n)
       {
           this.n = n;
       }
       public void checkDisplay()
       {
           if(n>=0)
             System.out.println("Number is positive");
           else
             System.out.println("Number is Negative");
       }
       public static void main(String[]arg)
       {
            CheckPN c = new CheckPN();
            c.getData(-12);
            c.checkDisplay();
       }
     }
