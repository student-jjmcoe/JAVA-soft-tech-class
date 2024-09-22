class Sample implements Runnable
     {
          public Sample()
           {
               Thread t = new Thread(this);
               t.start();
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
class Sample2
      {
            public static void main(String[]arg)
              {
                   Sample x = new Sample();
              }
       }