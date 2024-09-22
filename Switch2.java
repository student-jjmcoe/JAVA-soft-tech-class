import java.util.*;
class Switch2
  {
      public static void main(String[]arg)
         {
             float rs,p,d,e;
             int ch;
             Scanner x = new Scanner(System.in);
              
             System.out.println("1.Rs to Dollar");
             System.out.println("2.Rs to Pound");
             System.out.println("3.Rs to Euro");

             System.out.println("Enetr a number");
             rs = x.nextFloat();
             System.out.println("Enter choice");
             ch = x.nextInt();
 
             switch(ch)
             {
                case 1: d=rs/86;
                        System.out.println("Dollar="+d);
                        break;
                case 2: p=rs/100;
                        System.out.println("Pound="+p);
                        break;
                case 3: e=rs/96;
                        System.out.println("Euro="+e);
                        break;
                default:System.out.println("Invalid Choice");
             }
         }
   }