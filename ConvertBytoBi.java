import java.util.*;
class ConvertBytoBi
     {
         public static void main(String[]arg)
              {
                    float bi,by;
                    Scanner x = new Scanner(System.in);
                    System.out.println("Enter a value:");
                    by = x.nextFloat();
                    bi = (by)*8;
                    System.out.println("Bits="+bi);
                }
      }