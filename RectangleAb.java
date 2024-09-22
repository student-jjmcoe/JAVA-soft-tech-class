abstract class Rectangle
    {
       abstract void getData(int b,int l);
       abstract float cal();
       public void display(float a)
       {
          System.out.println(a);
       }
    }
class RectangleAb extends Re                                                                                               ctangle
    {
       int b,l;
       void getData(int b,int l)
       {
          this.b=b;
          this.l=l;
       }
       float cal()
       {
          return(l*b);
       }
       public static void main(String[]arg)
       {
          RectangleAb x=new RectangleAb();
          x.getData(23,1);
          float a=x.cal();
          x.display(a);
       }
    }