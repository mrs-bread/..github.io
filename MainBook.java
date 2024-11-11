import java.util.Scanner;

public class MainBook {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите Название книги:");
        String NameBook=sc.nextLine();
        System.out.println("Введите Автора:");
        String author=sc.nextLine();
        System.out.println("Введите количество страниц:");
        int cpage=sc.nextInt();
        System.out.println("Введите год:");
        int age=sc.nextInt();
        System.out.println("Введите стоимость:");
        int price=sc.nextInt();
        Book b1=new Book(price,age,cpage,author,NameBook);
        Library L=new Library();
        L.AddBook(b1);
        L.print();
        L.DelByName("Книга");
        L.print();
    }
}
