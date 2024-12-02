import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MyList {
    LinkedList<String>l;
    MyList(){
        l=new LinkedList<String>();
    }
    void create(){
       Scanner sc=new Scanner(System.in);
       String word;
       System.out.println("Введите слова: ");
       do{
           word=sc.nextLine();
           if(!word.isEmpty())
               l.add(word);
       }while(!word.isEmpty());
       sc.close();
    }
    void print(){
        System.out.println("Список слов: ");
        ListIterator<String> it=l.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    boolean isSymmetric(){
        ListIterator<String>forwardIterator=l.listIterator();
        ListIterator<String>backwardIterator=l.listIterator(l.size());
        while(forwardIterator.hasNext() && backwardIterator.hasPrevious()){
            if(!forwardIterator.next().equals(backwardIterator.previous()))
                return false;
        }
        return true;
    }
    boolean RemoveLastObject(String target){
        ListIterator<String>it=l.listIterator(l.size());
        while (it.hasPrevious()){
            if(it.previous().equals(target)) {
                it.remove();
                return true;
            }
        }
        return false;
    }
    void DuplicateFirstHalf(){
        int size=l.size();
        int halfSize=size/2;
        LinkedList<String>firstHalf=new LinkedList<>();
        ListIterator<String>it=l.listIterator();
        for(int i=0;i<halfSize;i++){
            firstHalf.add(it.next());
        }
        l.addAll(firstHalf);
    }
}
