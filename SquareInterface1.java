interface Square 
   {
       void getData(int s);
       void cal();
    }
interface Test extends Square
   {
       void display();
   }
class SquareInterface1 implements Test
   {
       int s,a;
       public void getData(int s)
       {
           this.s=s;
       }
       public void cal()
       {
           a=s*s;
       }
       public void display()
       {
           System.out.println("Area="+a);
       }
       public static void main(String[]arg)
       {
           SquareInterface1 x = new SquareInterface1();
           x.getData(20);
           x.cal();
           x.display();
       }
   }