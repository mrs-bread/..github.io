abstract class Progression {
    int []a;
    Progression(int[]a){
        this.a=a;
    }
    abstract double sum();
    abstract double element();
    void print(){
        System.out.println("Progression: ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
