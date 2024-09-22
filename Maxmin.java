import java.util.*;
class MaxMin
   {
        public static void main(String[]arg)
            {   
                int max;
                int min;
                int[]a = new int[5];
                
                Scanner x = new Scanner(System.in);
                System.out.println("Enter elements of Array");
                for(int i=0;i<5;i++)
                   a[i]=x.nextInt();
                max=a[0];
                min=a[0];
              
                for(int i=0;i<5;i++)
                 {
                    if(a[i]>max)
                       max=a[i];
                    if(a[i]<min)
                       min=a[i];
                 }
                System.out.println("Maximum="+max);
                System.out.println("Minimum="+min);
            }
     }