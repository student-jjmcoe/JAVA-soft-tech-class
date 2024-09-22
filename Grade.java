import java.util.*;
class Grade
   {
        public static void main(String[]arg)
           {
              int m;
              Scanner x = new Scanner(System.in);
              System.out.println("Enter number");
              m = x.nextInt();
              
              if(m<35)
                 System.out.println("Fail");
              else
                 if(m<50)  
                    System.out.println("Pass");
                 else
                     if(m<65)
                          System.out.println("Second class");
                     else
                          
                        if(m<75)
                              System.out.println("first class");
                        else
                              System.out.println("Distinction");
            }
    }
 