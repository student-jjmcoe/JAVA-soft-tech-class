class EvenOrOdd
   {
       int n;
       public EvenOrOdd(int n)
       {
          this.n=n;
       }
       public void cal()
       {
          if(n%2==0)
             System.out.println("Even");
          else
             System.out.println("Odd");
       }

       public static void main(String[]arg)
       {
            EvenOrOdd x = new EvenOrOdd(22);
            x.cal();
       }
    }