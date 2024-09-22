import java.util.*;
class Choice3
     {
         public static void main(String[]arg)
            {
                float f,i,cm,m,ch;
                Scanner x = new Scanner(System.in);
                System.out.println("1.feet to Inch");
                System.out.println("1.feet to Centimeter");
                System.out.println("1.feet to Meter");
                
                System.out.println("Enter a number:");
                f = x.nextFloat();
                System.out.println("Enter choice:");
                ch = x.nextFloat();

                if(ch==1)
                {
                    i=f*12;
                    System.out.println("Inch="+i);
                 }
                 else
                    if(ch==2)
                    {
                        cm=f*30;
                        System.out.println("Centimeter="+cm);
                    }
                    else
                       if(ch==3)
                       {
                            m=f*3.2f;
                            System.out.println("Meter="+m);
                       }
                       else
                            System.out.println("Invalid Input");
                }
     }
                           
        
                