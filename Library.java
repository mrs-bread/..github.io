import java.util.ArrayList;

public class Library {
    ArrayList<Book>a;
    Library(){
        a=new ArrayList<Book>();
    }
    void AddBook(Book B){
        a.add(B);
    }
    void print(){
        System.out.println("My Library:");
        for(int i=0;i<a.size();i++)
            a.get(i).Print();
    }
    void DelByName(String Name){
        int p=-1;
        for(int i=0;i<a.size();i++){
            if(Name.equals(a.get(i).getNameBook()))
                p=i;
        }
        if(p>-1){
            a.remove(p);
            System.out.println("Успешно удалили");
        }
        else System.out.println("Нет такой книги");
    }
    void SortByStr(){
        a.sort(Book.kolComparator);
    }
    void SortByAuthor(){
        a.sort(Book.authorComparator);
    }
}
