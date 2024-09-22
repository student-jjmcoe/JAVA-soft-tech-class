class Person
   {
      String nm;
      public Person(String nm)
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
      public Stud(int rno,String nm)
      {
         super(nm);
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
      public Employee(int id,int rno, String nm)
      {
         super(rno,nm);
         this.id=id;
         
      }
      public void display()
      {
          super.display();
          System.out.println("Id="+id);
      }
    }
      
class MultiLevelConstruct
   {
       public static void main(String[]arg)
       {
           Employee e = new Employee(1079,10,"Shweta");
           e.display();
       }
    }
           
         
         
      
      