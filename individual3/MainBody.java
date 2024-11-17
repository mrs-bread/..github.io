import java.util.Scanner;

public class MainBody {
    public static void main(String[] args){
        Body[] b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите количество фигур:");
        int k=sc.nextInt();
        b=new Body[k];
        for(int i=0;i<k;i++){
            System.out.println("1 - Параллелипипед, 2 - Шар");
            int p=sc.nextInt();
            if(p==1){
                System.out.print("Введите длину, ширину, высоту: ");
                double length=sc.nextDouble();
                double width=sc.nextDouble();
                double height=sc.nextDouble();
                Parallelepiped parallelepiped=new Parallelepiped(length,width,height);
                b[i]=parallelepiped;
            }
            if(p==2){
                System.out.print("Введите радиус: ");
                double radius=sc.nextDouble();
                Ball ball=new Ball(radius);
                b[i]=ball;
            }
        }
        for(int i=0;i<k;i++){
            b[i].print();
            System.out.println("Площадь поверхности: "+b[i].S());
            System.out.println("Объём: "+b[i].V());
            System.out.println("----------------------------------------------");
        }
    }
}
