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
        public Stud(int rno, String nm)
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
class SingleLevelConstruct
    {
        public static void main(String[]arg)
        {
           Stud x = new Stud(7,"Shweta");
           x.display();
        }
    }