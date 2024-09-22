class Key_this
   {
       int a,b,c;
       public void getData(int a, int b)
       {
            this.a = a;
            this.b = b;
       }
       public void cal()
       {
            c=a+b;
       }
       public void display()
       {
          System.out.println("Addition="+c);
       }
       public static void main(String[]arg)
       {
           Key_this k = new Key_this();
           k.getData(23,12);
           k.cal();
           k.display();
       }
    }  
 