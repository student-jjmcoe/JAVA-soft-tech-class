import java.util.*;
class LaeapYear
     {
         public static void main(String[]arg)
             {
                   int y;
                   Scanner x = new Scanner(System.in);
                   System.out.println("Enetr a number");
                   y = x.nextInt();

                   if(y%4==0)
                     System.out.println("the year is laeap");
                   else
                     System.out.println("the year is not laeap");
             }
       }