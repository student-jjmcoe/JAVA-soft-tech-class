class EvenOddOOP
   {
      int n;
      public void getData(int n)
      {
          this.n = n;
      }
      public void checkDisplay()
      {
          if(n%2==0)
            System.out.println("Number is Even");
          else
            System.out.println("Number is Odd");
      }
       
      public static void main(String[]arg)
      {
           EvenOddOOP x = new EvenOddOOP();
           x.getData(98);
           x.checkDisplay();
      }
   }