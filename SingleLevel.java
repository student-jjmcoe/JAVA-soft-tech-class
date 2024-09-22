class Person
  {
     String nm;
     public void getData(String nm)
     {
         this.nm=nm;
     }
     public void display()
     {
         System.out.println("Name="+nm);
     }
   }
class Stud extends Person
  {
     int rno;
     public void getData(String nm, int rno)
     {
        super.getData(nm);
        this.rno=rno;
     }
     public void display()
     {
        super.display();
        System.out.println("Roll Number="+rno);
     }
   }
class SingleLevel
   {  
      public static void main(String[]arg)
      {
         Stud x = new Stud();
         x.getData("h",7);
         x.display();
      }
   }

         