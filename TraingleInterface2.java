interface Traingle
   {
       void getData(int b, int h);
       void cal();
   }
interface Test extends Traingle
   {
       void display();
   }
class TraingleInterface2 implements Test
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
           TraingleInterface2 x = new TraingleInterface2();
           x.getData(12,23);
           x.cal();
           x.display();
       }
    }