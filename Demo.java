class Demo
   {
        final int age = 20;
        void show()
        {
            System.out.println(age);
        }
        age = 30;
        public static void main(String[]arg)
        {
            Demo d = new Demo();
            d.show();
        }
   }