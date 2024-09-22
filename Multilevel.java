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
         public void getData(int rno,String nm)
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
class Employee extends Stud
    {
         int id;
         public void getData(int rno,int id, String nm)
       {
           super.getData(nm);
           this.id=id;
       }
       public void display()
       {
           super.display();
           System.out.println("Id="+id);
       }
    }
 class MultiLevel
   {  
      public static void main(String[]arg)
      {
         Employee x = new Employee();
         x.getData(7,100,"Shweta");
         x.display();
      }
   }
