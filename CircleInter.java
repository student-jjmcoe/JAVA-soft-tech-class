interface Circle
    {
        void getData(int r);
        void cal();
        void display();
    }
class CircleInter implements Circle
    {
        int r;
        float a;
        public void getData(int r)
        {
            this.r=r;
        }
        public void cal()
        {
           a=3.14f*r*r;
        }
        public void display()
        {
           System.out.println("Area="+a);
        }
        public static void main(String[]arg)
        {
          CircleInter x = new CircleInter();
          x.getData(3);
          x.cal();
          x.display();
        }
    }  