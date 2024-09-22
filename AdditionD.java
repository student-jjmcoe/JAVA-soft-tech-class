class AdditionD
   {
        int a,b,c;
        public AdditionD()
        {
            a=10;
            b=20;
        }
        public void cal()
        {
            c = a+b;
        }
        public void display()
        {
            System.out.println("Addition="+c);
        }

        public static void main(String[]arg)
        {
           AdditionD x = new AdditionD();
           x.cal();
           x.display();
        }
     }