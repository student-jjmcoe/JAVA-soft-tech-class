class Addition
    {
        int sum(int a,int b)
        {
            return(a+b);
        }
        int sum(int a,int b,int c)
        {
            return(a+b+c);
        }
        float sum(float a,int b)
        {
             return(a+b);
        }
    }
class AdditionPoly
    {
        public static void main(String[]arg)
        {
            Addition a = new Addition();
            System.out.println(a.sum(2,4));
            System.out.println(a.sum(2,3,4));
            System.out.println(a.sum(2.1f,9));
        }
     }  