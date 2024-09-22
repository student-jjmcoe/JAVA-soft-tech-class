abstract class Circle
   {
        abstract void getData(int r);
        abstract float cal();
        public void display(float p)
        {
            System.out.println(p);
        }
    }
class CircleAb extends Circle
    {
         int r;
         float a;
         void getData(int r)
         {
            this.r=r;
         }
         float cal()
         {
            a = 3.14f*r*r;
            return(a);
         }
         public static void main(String[]arg)
         {
             CircleAb x = new CircleAb();
             x.getData(3);
             float p = x.cal();
             x.display(p);
         }
     }