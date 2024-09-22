abstract class Square
   {
       abstract void getData(int s);
       abstract int cal();
       public void display(int a)
       {
          System.out.println(a);
       }
   }
class SquareAb extends Square
   {
       int s;
       void getData(int s)
       {
           this.s=s;
       }
       int cal()
       {
           return(s*s);
       }
       public static void main(String[]arg)
       {
           SquareAb x = new SquareAb();
           x.getData(5);
           int a= x.cal();
           x.display(a);
       }
    }