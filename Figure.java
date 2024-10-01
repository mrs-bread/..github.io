import java.util.Scanner;

public class Figure {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Кол-во тел:");
        int n=sc.nextInt();
        Telo[]t=new Telo[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("1-Ball,2-Paral");
            int p= sc.nextInt();
            if(p==1)
            {
                System.out.println("Введите радиус:");
                int []a=new int[1];
                a[0]=sc.nextInt();
                Ball ball=new Ball(a);
                t[i]=ball;
            }
            if(p==2)
            {
                System.out.println("Введите стороны и высоту:");
                int[]a=new int[3];
                for(int j=0;j<3;j++)
                    a[j]=sc.nextInt();
                Paral pa=new Paral(a);
                t[i]=pa;
            }
        }
        for(int i=0;i<n;i++)
        {
            t[i].print();
            System.out.println("S= "+t[i].s());
            System.out.println("V= "+t[i].v());
        }
    }
}
