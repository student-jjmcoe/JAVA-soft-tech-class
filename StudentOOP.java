class StudentOOP
   {
       int a,b,c;
       float t,p;
       public void getData(int a,int b,int c)
       {
            this.a = a;
            this.b = b;
            this.c = c;
       }
       public void cal()
       {
           t = a+b+c;
           p = t/3;
       }
       public void display()
       {
           System.out.println("Total="+t);
           System.out.println("Percentage="+p);
        }
 
        public static void main(String[]arg)
        {
           StudentOOP x = new StudentOOP();
           x.getData(10,23,17);
           x.cal();
           x.display();
        }
     }