interface Rectangle
   {
       void getData(int l, int b);
       void cal();
       void display();
   }
class RectangleInterface1 implements Rectangle
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
           RectangleInterface1 x = new RectangleInterface1();
           x.getData(10,12);
           x.cal();
           x.display();
       }
   }