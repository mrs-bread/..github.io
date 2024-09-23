import java.util.Random;
import java.util.Scanner;
public class Matrix {
    private int [][]m;
    Matrix (int size)
    {
        Scanner in = new Scanner(System.in);
        m=new int[size][size];
        Random r=new Random();
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[i].length;j++)
                m[i][j]=in.nextInt();
    }
    void Print()
    {
        for(int i=0;i<m.length;i++)
        {
            System.out.println();
            for(int j=0;j<m[i].length;j++)
                System.out.print(m[i][j]+" ");}
    }
    int pr(int a)
    {
        int l=0;
        for(int i=2;i<a;i++)
            if(a%i==0)
                l++;
        if(l==0)
            return 1;
        return 0;
    }
    int Sum()
    {
        int sum=0;
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[i].length;j++)
            {
                if(i<j && pr(m[i][j])==1)
                    sum+=m[i][j];
            }
        return sum;
    }


}
