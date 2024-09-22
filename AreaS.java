class AreaS
  {
      int s,a;
      public void getData(int s)
      {
          this.s=s;
      }
      public void cal()
      {
           a = s*s;
      }
      public void display()
      {
          System.out.println("Area of Square="+a);
      }

      public static void main(String[]arg)
      {
            AreaS a = new AreaS();
            a.getData(10);
            a.cal();
            a.display();
      }
   }