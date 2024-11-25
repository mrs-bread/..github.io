import java.util.Scanner;

public class ListTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Number>l=new List<>();
        int elem;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            elem=sc.nextInt();
            l.add(elem);
        }
        System.out.println("Список: "+l.isSymmetric());
        l.Print();
        l.DeleteFirst(2);
        l.Print();
        l.deleteIndex(3);
        l.Print();
    }
}
