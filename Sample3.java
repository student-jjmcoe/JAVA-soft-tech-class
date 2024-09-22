class Sample implements Runnable
    {
          Thread t;
          String nm;
          public Sample(String nm)
          {
                this.nm=nm;
                t = new Thread(this);
                t.start();
          }
          public void run()
          {  try
               {
                 for(int i=1;i<11;i++)
                 {
                     System.out.println(nm+" "+i);
                     Thread.sleep(1000);
                  }
               }
            catch(InterruptedException e)
               {
                }
         }
     }
class Sample3
     {    public static void main(String[]arg)
        {
          Sample s1 = new Sample("childa");
          Sample s2 = new Sample("childb");
         try
            {
                s1.t.join();
                s2.t.join();
                Sample s3 = new Sample("childc");
           
                System.out.println(s1.t.isAlive());
                System.out.println(s2.t.isAlive());
             }
          catch(Exception e)
             {
             }
      }
}