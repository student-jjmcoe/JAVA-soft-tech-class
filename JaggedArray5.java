import java.util.*;
class JaggedArray5
    {
        public static void main(String[]arg)
           {
                int n,max;
                int[][] a = new int[3][];
                Scanner x = new Scanner(System.in);
                System.out.println("Enetr row");
                n=x.nextInt();

                System.out.println("Enter Elements");
                a[0] = new int[2];
                a[1] = new int[3];
                a[2] = new int[2];

                for(int i=0;i<2;i++)
                   a[0][i]=x.nextInt();
                for(int i=0;i<3;i++)
                   a[1][i]=x.nextInt();

                for(int i=0;i<2;i++)
                   a[2][i]=x.nextInt();

                max = a[n][0];
                for(int i=0;i<a[n].length;i++)
                {
                    if(max<a[n][i])
                    {
                        max = a[n][i];
                    }
                }
               System.out.println("Maximum="+max);
           }
     }



        