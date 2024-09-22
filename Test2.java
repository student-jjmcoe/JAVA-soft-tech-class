class Person
    {
       String nm;
       public void getData(String nm)
       {
           this.nm = nm;
       }
       public void display()
       {
           System.out.println(nm);
       }
    }
class Stud extends Person
    {
        int rno;
        public void getData(int rno, String nm)
        {
            super.getData(nm);
            this.rno=rno;
        }
        public void display()
        {
            super.display();
            System.out.println(rno);
        }
     }
class Employee extends Person
    {
        int id;
        public void getData(int id, String nm)
        {
            super.getData(nm);
            this.id=id;
        }
        public void display()
        {
            super.display();
            System.out.println(id);
        }
     }
class Test2
     {   public static void main(String[]arg)
          {
           Stud x = new Stud();
           Employee e = new Employee();
           x.getData(100,"abc");
           x.display();
           e.getData(108,"abc");
           e.display();
          }
     }