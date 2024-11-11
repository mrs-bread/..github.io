public class Book {
    private int price;
    private int age;
    private int cpage;
    private String author;
    private String NameBook;
    Book(int price, int age, int cpage, String author, String NameBook){
        this.price=price;
        this.age=age;
        this.cpage=cpage;
        this.author=author;
        this.NameBook=NameBook;
    }

    int getPrice(){return price;}
    int getAge(){return age;}
    int getCpage(){return cpage;}
    String getAuthor(){return author;}
    String getNameBook(){return NameBook;}
    void setPrice(int price){this.price=price;}
    void setAge(int age){this.age=age;}
    void setCpage(int cpage){this.cpage=cpage;}
    void setAuthor(String author){this.author=author;}
    void setNameBook(String NameBook){this.NameBook=NameBook;}

    void Print(){
        System.out.println("Название книги:"+NameBook+"\nАвтор: "+author+"\nГод: "+age+"\nКол-во страниц: "+cpage+"\nСтоимость: "+price);
    }
}