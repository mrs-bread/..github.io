import java.util.Scanner;

public class PairBody {
    public static void main(String [] args){
        Pair[] f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert count elements:");
        int k=sc.nextInt();
        f=new Pair[k];
        for(int i=0;i<k;i++){
            System.out.println("1 - Complex, 2 - Fraction");
            int p=sc.nextInt();
            if(p==1){
                System.out.println("Insert re, im");
                int re=sc.nextInt();
                int im=sc.nextInt();
                Complex complex=new Complex(re,im);
                f[i]=complex;
                }
            if(p==2) {
                System.out.println("Insert ch,zn");
                int ch=sc.nextInt();
                int zn=sc.nextInt();
                Fraction fraction=new Fraction(ch,zn);
                f[i]=fraction;
            }
        }
        for(int i=0;i<k-1;i++){
            System.out.println("First:");
            f[i].print();
            System.out.println("Second:");
            f[i+1].print();
            System.out.println("Add:");
            (f[i].add(f[i+1])).print();
            System.out.println("Sub:");
            (f[i].sub(f[i+1])).print();
            System.out.println("Mul:");
            (f[i].mul(f[i+1])).print();
            System.out.println("Del:");
            (f[i].del(f[i+1])).print();
        }
    }
}
