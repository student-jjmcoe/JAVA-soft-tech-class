Package Pack1
class Stud
    {
        String nm;
        int age;
        public void getData(String nm, int age)
        {
            this.nm=nm;
            this.age=age;
        }
        public void display()
        {
            System.out.println("Name="+nm);
            System.out.println("Age="+age);
        }
     }