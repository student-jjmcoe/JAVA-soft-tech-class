import java.util.*;
class Addition
        {
           public static void main(String[]arg)
             {   int a,b,c;
                 Scanner x = new Scanner(System.in);
                 System.out.println("Enter two numbers:");
                 
                 a = x.nextInt();
                 b = x.nextInt();
                 c = a+b;
 
                 System.out.println("Addition is ="+c);
             }
         }