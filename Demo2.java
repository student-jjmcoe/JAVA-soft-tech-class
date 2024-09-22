class Test
    {
        final void show()
         {
             System.out.println("Fina Method");
         }
    }
class Demo2 extends Test
    {
        void show()
        {
             super.show();
             System.out.println("It is not a final Method");
        }
        public static void main(String[]arg)
        {
             Demo2 x = new Demo2();
             x.show();
        }
    }
              