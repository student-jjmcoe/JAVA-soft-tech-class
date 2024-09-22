class AdditionParameter
    {
       int a,b,c;
       public void getData(int x, int y)
       {
            a=x;
            b=y;
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
          AdditionParameter x = new AdditionParameter();

          x.getData(19,11);
          x.cal();
          x.display();
       }  
   }