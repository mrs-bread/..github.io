public class MyListTest {
    public static void main(String[] args){
        MyList l=new MyList();
        String target="target";
        l.create();
        System.out.println("_____________________________________");
        System.out.println("`'`'`'`'`'`'`'`'`'`'`'`'`'`'`'`'`'`'");
        l.print();
        l.DuplicateFirstHalf();
        System.out.println("________________________________________");
        l.print();
    }
}
