class AdditionOOP
    {
        int a,b,c;
        public void getData()
        {
            a=10;
            b=20;
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
            Addition x = new Addition();

            x.getData();
            x.cal();
            x.display();
        }
     }