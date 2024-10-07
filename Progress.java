import java.util.Scanner;

public class Progress {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Count of progression:");
        int n=sc.nextInt();
        Progression[]p=new Progression[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("1-Arithmetic Progression, 2-Geometric Progression");
            int m=sc.nextInt();
            if(m==1){
                System.out.println("Insert first element,step, k-position:");
                int[]a=new int[3];
                for(int j=0;j<3;j++)
                    a[j]=sc.nextInt();
                ArithmeticP ari=new ArithmeticP(a);
                p[i]=ari;
            }
            if(m==2){
                System.out.println("Insert first element,step, k-position:");
                int[]a=new int[3];
                for(int j=0;j<3;j++)
                    a[j]=sc.nextInt();
                GeometricP geo=new GeometricP(a);
                p[i]=geo;
            }
        }
        for(int i=0;i<n;i++)
        {
            p[i].print();
            System.out.println("Sum first k-elements = "+p[i].sum());
            System.out.println("k-element = "+p[i].element());
        }
    }
}
