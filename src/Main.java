
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int y= in.nextInt();
        Point p1=new Point(x,y);
        x=in.nextInt();
        y= in.nextInt();
        Point p2=new Point(x,y);
        x=in.nextInt();
        y= in.nextInt();
        Point p3=new Point(x,y);
        Triangle t=new Triangle(p1,p2,p3);
        t.Print();
        System.out.println();
        t.St();
        System.out.println("   "+t.P());
        System.out.println("   "+t.Pl(t));
    }
}