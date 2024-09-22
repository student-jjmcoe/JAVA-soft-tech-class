class AdditionP
   {
       int a,b,c;
       public AdditionP(int a, int b)
       {
         this.a = a;
         this.b = b;
       }
       public void cal()
       {
          c=a+b;
       }
       public void display()
       {
         System.out.println("Addition="+c);
       }

       public static void main(String[]arg)
       {
           AdditionP x=new AdditionP(16,20);
           x.cal();
           x.display();
       }
    }