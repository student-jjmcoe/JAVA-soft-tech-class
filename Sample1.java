class Sample extends Thread
   {
        public Sample()
          {
              super();
              start();
          }
        public void run()
          {
              try{
                for(int i=0;i<11;i++)
                {
                   System.out.println(i);
                   Thread.sleep(1000);
                }
                  }
              catch(InterruptedException e)
                {
                }
           }
     }
class Sample1 
   {
        public static void main(String[]arg)
          {
               Sample x1 = new Sample();
               Sample x2 = new Sample();
               Sample x3 = new Sample();
          }
    }