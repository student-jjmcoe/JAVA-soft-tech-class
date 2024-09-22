interface Traingle
   {
      void getData(int b, int h);
      void cal();
      void display();
   }
class TraingleInterface1 implements Traingle
   {
       int b,h;
       float a;
       public void getData(int b, int h)
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
          System.out.println("Area="+a);
       }
       public static void main(String[]arg)
       {
          TraingleInterface1 x = new TraingleInterface1();
          x.getData(12,23);
          x.cal();
          x.display();
       }
    }