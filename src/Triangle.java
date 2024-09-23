public class Triangle {
    private Point p1,p2,p3;
    Triangle(Point l1,Point l2,Point l3)
    {
        p1=new Point(l1.getX(),l1.getY());
        p2=new Point(l2.getX(),l2.getY());
        p3=new Point(l3.getX(),l3.getY());

    }
    void St(){
        System.out.print("A="+p1.dist(p2)+" B="+p2.dist(p3)+" C="+p3.dist(p1));
    }
    double P() {
        return p1.dist(p2) + p2.dist(p3) + p3.dist(p1);
    }
    double Pl(Triangle t){
        double pa=t.P()-p1.dist(p2);
        double pb=t.P()-p2.dist(p3);
        double pc=t.P()-p3.dist(p1);
        return Math.sqrt(t.P()*pa*pb*pc);
    }
    void Print(){
        p1.Print();
        p2.Print();
        p3.Print();
    }

}
