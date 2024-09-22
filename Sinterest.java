class Sinterest
   {
       int p,n,r,s;
       public Sinterest()
       {
           p=1000;
           n=12;
           r=20;
       }
       public Sinterest(int p)
       {
          this.p=p;
       }
       public Sinterest(int p, int n)
       {
          this.p=p;
          this.n=n;
       }
       public Sinterest(int p, int n, int r)
       {
           this.p=p;
           this.n=n;
           this.r=r;
       }
       public void cal()
       {
           s=(p*n*r)/100;
       }
       public void display()
       {
          System.out.println("Simple Interest="+s);
       }

       public static void main(String[]arg)
       {
           Sinterest x = new Sinterest();
           Sinterest x1 = new Sinterest(2000);
           Sinterest x2 = new Sinterest(1500,11);
           Sinterest x3 = new Sinterest(1800,10,25);

           x.cal();
           x.display();
           x1.cal();
           x1.display();
           x2.cal();
           x2.display();
           x3.cal();
           x3.display();
        }
     }
           
