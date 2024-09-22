abstract class SimpleInterest
     {
         abstract void getData(int p,int n, int r);
         abstract float cal();
         public void display(float s)
         {
             System.out.println(s);
         }
     }
class SimpleInterestAb extends SimpleInterest
     {
         int p,n,r;
         void getData(int p, int n, int r)
         {
             this.p=p;
             this.n=n;
             this.r=r;
         }
         float cal()
         {
             return((p*n*r)/100);
         }
         public static void main(String[]arg)
         {
              SimpleInterestAb x = new SimpleInterestAb();
              x.getData(1000,5,20);
              float s=x.cal();
              x.display(s);
         }
     }