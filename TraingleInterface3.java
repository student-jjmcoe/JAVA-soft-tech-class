interface Traingle
   {
       void getData(int b, int h);
       void cal();
   }
interface Test 
   {
       void display();
   }
class TraingleInterface3 implements Traingle,Test
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
          TraingleInterface3 x = new TraingleInterface3();
          x.getData(12,23);
          x.cal();
          x.display();
      }
  }