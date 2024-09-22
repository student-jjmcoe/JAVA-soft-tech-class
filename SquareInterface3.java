interface Square
   {
      void getData(int s);
      void cal();
   }
interface Test
   {
      void display();
   }
class SquareInterface3 implements Square,Test
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
           SquareInterface3 x = new SquareInterface3();
           x.getData(3);
           x.cal();
           x.display();
       }
    }