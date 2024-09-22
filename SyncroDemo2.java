class Table
     {
        synchronized void printTable(int n)
           {
                for(int i=1;i<11;i++)
                    {
                         System.out.println(n*i);
                            try{
                                    Thread.sleep(400);
                                }
                            catch(Exception e)
                                {
                                   System.out.println(e);
                                }
                     }
           }
       }
class MyThread1 extends  Thread
      {
           Table t;
           MyThread1(Table t)
           {
               this.t=t;
               start();
            }
            public void run()
            {
                t.printTable(5);
            }
      }
class MyThread2 extends Thread
      {
            Table t;
            MyThread2(Table t)
            {
                this.t=t;
                start();
            }
            public void run()
            {
                 t.printTable(6);
             }
       }
public class SyncroDemo2
     {
          public static void main(String[]arg)
              {
                  Table obj = new Table();
                  MyThread1 t1 = new MyThread1(obj);
                  MyThread2 t2 = new MyThread2(obj);
              }
     }














