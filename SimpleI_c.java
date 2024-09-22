class SimpleI_c
   {
       int p,n,r,s;
       public SimpleI_c(int p,int n,int r)
       {
           this.p=p;
           this.n=n;
           this.r=r;
       }
       public void cal(){
           s=(p*n*r)/100;
       }
       public void display()
       {
           System.out.println("Simple Interest="+s);
       }
       public static void main(String[]arg)
       {
          SimpleI_c x = new SimpleI_c(2000,10,20);
          x.cal();
          x.display();
       }
    }