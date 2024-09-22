interface Circle
   {
      void getData(int r);
      void cal();
   }
interface Test
   {
      void display();
   }
class CircleInter3 implements Circle,Test
   {
      int r;
      float a;
      public void getData(int r)
      {
          this.r=r;
      }
      public void cal()
      {
          a=3.14f*r*r;
      }
      public void display()
      {
         System.out.println(a);
      }
      public static void main(String[]arg)
      {
         CircleInter2 x = new CircleInter2();
         x.getData(3);
         x.cal();
         x.display();
      }
}
