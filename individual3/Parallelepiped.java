public class Parallelepiped implements Body{
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length,double width,double height){
        this.height=height;
        this.width=width;
        this.length=length;
    }

    public double S(){
        return 2*(length*width+length*height+width*height);
    }

    public double V(){
        return length*width*height;
    }

    public void print(){
        System.out.println("Параллелипипед:");
        System.out.println("Длина: "+length+"\nШирина: "+width+"\nВысота: "+height);
    }
}
