class StaticMethod
     {
          int a;
          static int b;
          StaticMethod()
          {
              a++;
              b++;
          }
          void show()
          {
              System.out.println(a);
          }
          static void display()
          {
                  System.out.println(b);
          }
          public static void main(String[]arg)
          {
              StaticMethod x = new StaticMethod();
              x.show();
              StaticMethod.display();
          }
     }