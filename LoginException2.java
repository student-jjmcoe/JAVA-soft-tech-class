class LoginException extends Exception
   {
        LoginException(String msg)
        {
             super(msg);
        }
   }
class LoginException2
   {
        public static void main(String[]arg)
          {
              String u ="Sweta";
              String p ="@123";
              try
              {
                 if((u=="Shweta")&&(p=="@123"))
                   System.out.println("Login Successful");
                 else 
                   {
                       LoginException x = new LoginException("Wrong Username or Password");
                       throw x;
                   }
              }
              catch(LoginException e)
              {
                   System.out.println(e);
              }
          }
    }