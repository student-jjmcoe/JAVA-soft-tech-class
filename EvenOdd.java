import java.util.*;
class EvenOdd
     {
          public static void main(String[]arg)
             {
                 int n;
                 Scanner x = new Scanner(System.in);
                 System.out.println("Enter a number");
       
                 n = x.nextInt();
   
                 if(n%2==0)
                   System.out.println("Number is Even");
                 else
                   System.out.println("Number is Odd");
              }
      }