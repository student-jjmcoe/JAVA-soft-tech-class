class Static1
   {
        int a;
        static int b;

        Static1()
        {
            a++;
            b++;
        }
        void show()
        {
            System.out.println(a);
            System.out.println(b);
        }        
        public static void main(String[]arg)
        {
            Static1 t = new Static1();
            t.show();
            Static1 t1 = new Static1();
            t1.show();
            Static1 t2 = new Static1();
            t2.show();
        }
   }