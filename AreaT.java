class AreaT
   {
       int b,h;
       float a;
       public AreaT(int b, int h)
       {
          this.b=b;
          this.h=h;
       }
       public void cal()
       {
          a=0.5f*b*h;
       }
       public void display()
       {
          System.out.println("Area of Traingle="+a);
       }

       public static void main(String[]arg)
       {
            AreaT z = new AreaT(10,30);
            z.cal();
            z.display();
       }
    }