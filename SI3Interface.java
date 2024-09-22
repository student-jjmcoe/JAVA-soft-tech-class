interface SI
{
      void getData(int p, int n, int r);
      void cal();
}
interface Test
{
      void display();
}
class SI3Interface implements SI,Test
{
         int p,n,r;
         float s;
         public void getData(int p, int n, int r)
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
             SI3Interface x = new SI3Interface();
             x.getData(1000,5,20);
             x.cal();
             x.display();
         }
}
