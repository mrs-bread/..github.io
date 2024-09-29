import java.util.Scanner;

public class Vector {
    private int []v;
    Vector(int size)
    {
        Scanner in=new Scanner(System.in);
        v=new int[size];
        for(int i=0;i<v.length;i++)
            v[i]=in.nextInt();
    }
    void Print(){
        for(int i=0;i<v.length;i++)
            System.out.print(v[i]+" ");
    }
    void Um(int x){
        for(int i=0;i<v.length;i++)
            v[i]*=x;
    }
    void Del(int x){
        for(int i=0;i<v.length;i++)
            v[i]/=x;
    }
    int getEl(int x){
        if(x>=0 && x<v.length)
        {
            return v[x];
        }
        else{
        System.out.println("Выход за границы");
        return 0;}
    }
}
