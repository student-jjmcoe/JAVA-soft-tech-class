class SimpleI
   {
        int p,n,r,s;
        public void getData(int p, int n, int r)
        {
             this.p = p;
             this.n = n;
             this.r = r;
        }
        public void cal()
        {
            s = (p*n*r)/100;
        }
        public void display()
        {
           System.out.println("Simple Interest="+s);
        }
  
        public static void main(String[]arg)
        {
             SimpleI s = new SimpleI();
             s.getData(1000, 2 ,20);
             s.cal();
             s.display();
        }
    }   