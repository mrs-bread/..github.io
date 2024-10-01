abstract class Telo {
    int[]a;
    Telo(int[]a){
        this.a=a;
    }
    abstract double s();
    abstract double v();
    void print(){
        System.out.println("Фигура со сторонами: ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
