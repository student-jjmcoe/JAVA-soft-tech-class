import java.util.*;
class Switch1
    {
       public static void main(String[]arg)
          {
              int a,b,c,ch;
              Scanner x = new Scanner(System.in);
              
              System.out.println("1.Addition");
              System.out.println("2.Substraction");
              System.out.println("3.Multiplication");
              System.out.println("4.Division");
 
              System.out.println("Enter two numbers");
              a = x.nextInt();
              b = x.nextInt();
  
              System.out.println("Enter choice");
              ch = x.nextInt();
 
              switch(ch)
              {
                 case 1: c=a+b;
                         System.out.println("Addition="+c);
                         break;
                 case 2: c=a-b;
                         System.out.println("Substraction="+c);
                         break;
                 case 3: c=a*b;
                         System.out.println("Multiplication="+c);
                         break;
                 case 4: c=a/b;
                         System.out.println("Division="+c);
                         break;
                 default:System.out.println("Invalid choice");
              }
          }
    }