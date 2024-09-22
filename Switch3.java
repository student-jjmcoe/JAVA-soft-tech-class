import java.util.*;
class Switch3
    {
       public static void main(String[]arg)
           {
                float f,i,cm,m;
                int ch;
 
                Scanner x = new Scanner(System.in);
           
                System.out.println("1.Feet to Inch");
                System.out.println("2.Feet to Centimeter");
                System.out.println("3.Feet to Meter");

                System.out.println("Enter a number");
                f = x.nextFloat();

                System.out.println("Enter choice");
                ch = x.nextInt();

                switch(ch)
                {
                    case 1: i=f*12;
                            System.out.println("Inch="+i);
                            break;
                    case 2: cm=f*30;
                            System.out.println("Centimeter="+cm);
                            break;
                    case 3: m=f*3.2f;
                            System.out.println("Meter="+m);
                            break;
                    default:System.out.println("Invalid choice");
                }
           }
     }