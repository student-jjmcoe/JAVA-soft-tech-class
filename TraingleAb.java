abstract class Traingle
     {
         abstract void getData(int b, int h);
         abstract float cal();
         public void display(float a)
         {
             System.out.println(a);
         }
    }
class TraingleAb extends Traingle
    {
         int b,h;
         void getData(int b, int h)
         {
             this.b=b;
             this.h=h;
         }
         float cal()
         {
            return(0.5f*b*h);
         }
         public static void main(String[]arg)
         {
            TraingleAb x = new TraingleAb();
            x.getData(20,10);
            float a=x.cal();
            x.display(a);
         }
    }
