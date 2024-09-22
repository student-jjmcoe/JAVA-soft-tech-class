import java.util.*;
class Student
    {
         public static void main(String[]arg)
              {
                   int m;
                   Scanner x = new Scanner(System.in);
                   System.out.println("Enter a number:");
                   m = x.nextInt();

                   if(m>35)
                      System.out.println("pass");
                   else
                      System.out.println("Fail");
               }
     }