import java.util.Scanner;

public class V {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        Vector v=new Vector(size);
        v.Print();
        int x=sc.nextInt();
        System.out.println(v.getEl(x));
        v.Print();
    }
}
