import java.util.*;
class Choice2
    {
       public static void main(String[]arg)
           {
                float rs,d,p,e,ch;
                Scanner x = new Scanner(System.in);
                System.out.println("1.Rs to Dollar");
                System.out.println("2.Rs to Pound");
                System.out.println("3.Rs to Euro");

                System.out.println("Enter a number");
                rs = x.nextFloat();
                  
                System.out.println("Enter choice");
                ch = x.nextFloat();
                
                if(ch==1)
                {
                   d=rs/86;
                   System.out.println("Dollar="+d);
                }
                else
                  if(ch==2)
                  {
                      p=rs/100;
                      System.out.println("Pound="+p);
                   }
                   else
                      if(ch==3)
                      {
                          e=rs/96;
                          System.out.println("Euro="+e);
                      }
                      else
                           System.out.println("Invalid input");
              }
    }


                