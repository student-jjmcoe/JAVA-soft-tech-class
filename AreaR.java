class AreaR
   {
      int l,b,a;
      public AreaR(int l, int b)
      {
         this.l = l;
         this.b = b;
      }
      public void cal()
      {
          a=l*b;
      }
      public void display()
      {
         System.out.println("Area of Rectangle="+a);
      }
     
      public static void main(String[]arg)
      {
          AreaR x = new AreaR(12,34);
          x.cal();
          x.display();
      }
    }
      