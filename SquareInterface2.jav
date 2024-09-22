interface Square
  {
     void getData(int s);
     void cal();
     void display();
  }
class SquareInterface2 implements Square
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
  }
class Square2
  {
     public static void main(String[]arg)
     {
          SquareInterface2 x = new SquareInterface2();
          x.getData(20);
          x.cal();
          x.display();
     }
  }