class PassFail
    {
         int m;
         public void getData(int m)
         {
             this.m=m;
         }
         public void check()
         {
            if(m>35)
               System.out.println("Student Pass");
            else
               System.out.println("Student Fail");
         }
         public static void main(String[]arg)
         {
              PassFail y = new PassFail();
              y.getData(96);
              y.check();
         }
       }