final class Test
  {
       void show()
          {
               System.out.println("final class");
          }
  }
class Demo3 extends Test
  {
        void show()
          {
               System.out.println("not in final class");
          }
        public static void main(String[]arg)
          {
               Demo3 x = new Demo3();
               x.show();
          }
  }