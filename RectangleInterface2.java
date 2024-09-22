interface Rectangle
     {
         void getData(int l, int b);
         void cal();
     }
interface Test extends Rectangle
     {
          void display();
     }
class RectangleInterface2 implements Test
     {
          int l,b,a;
          public void getData(int l, int b)
          {
              this.l=l;
              this.b=b;
          }
          public void cal()
          {
              a=l*b;
          }     
          public void display()
          {
              System.out.println("Area="+a);
          }
          public static void main(String[]arg)
          {
              RectangleInterface2 x = new RectangleInterface2();
              x.getData(12,13);
              x.cal();
              x.display();
         }
     }
          
          