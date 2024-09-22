import java.util.*;
class Search
    {
        public static void main(String[]arg)
           {
              int num,flag=0;
              int[]a = new int[6];
              Scanner x = new Scanner(System.in);
              System.out.println("Enter Element to Find");
              num = x.nextInt();

              System.out.println("Enter Array Elements");
              for(int i=0;i<6;i++)
                 a[i]=x.nextInt();

              for(int i=0;i<6;i++)
              {
                  if(a[i]==num)
                  {
                     flag=1;
                     break;
                   }   
               }
               if(flag==1)
                  System.out.println("Element Found");
               else
                  System.out.println("Element not Found");
           }
      }