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
class Employee extends Person
    {
        int id;
        public Employee(int id,String nm)
        {
           super(nm);
           this.id=id;
        }
        public void display()
        {
           super.display();
           System.out.println("Id="+id);
        }
    }
class Haierarchical
    {
        public static void main(String[]arg)
        {
           Stud s = new Stud(100,"SC");
           Employee e = new Employee(102,"SC");
           s.display();
           e.display();
        }
    }
           







        
 