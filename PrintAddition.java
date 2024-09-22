class Print
   {
       float area(float r)
       {
           return(3.14f*r*r);
       }
       int area(int l,int b)
       {
            return(l*b);
       }
       float area(float b,int h)
       {
            return(0.5f*b*h);
       } 
       int area(int s)
       {
            return(s*s);
       }
    }
class PrintAddition
    {
        public static void main(String[]arg)
        {
            Print p= new Print();
            System.out.println(p.area(3.1f));
            System.out.println(p.area(3,4));
            System.out.println(p.area(3.1f,1));
            System.out.println(p.area(3));
        }
     }
          