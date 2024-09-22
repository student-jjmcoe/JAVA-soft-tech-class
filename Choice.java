import java.util.*;
class Choice
     {
          public static void main(String[]arg)
              {
                   int a,b,c,ch;
                   Scanner x = new Scanner(System.in);
                   System.out.println("1.Addition");
                   System.out.println("2.Substraction");
                   System.out.println("3.Multiplication");
                   System.out.println("4.Division");
                   
                   System.out.println("enter two numbers");
                   a = x.nextInt();
                   b = x.nextInt();
                   System.out.println("Enter choice");
                   ch = x.nextInt();

                   if(ch==1)
                      {
                          c=a+b;
                          System.out.println("Addition="+c);
                       }
                   else
                       if(ch==2)
                           {
                                c=a-b;
                                System.out.println("Substraction="+c);
                            }
                       else
                          if(ch==3)
                            {
                                c=a*b;
                                System.out.println("Multiplication="+c);
                            }
                          else
                             if(ch==4)
                                {
                                    c=a/b;
                                    System.out.println("Division="+c);
                                 }
                              else
                                    System.out.println("invalid input");
              }
     }

                           
