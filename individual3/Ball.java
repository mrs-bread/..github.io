public class Ball implements Body{
    private double radius;

    public Ball(double radius){
        this.radius=radius;
    }

    public double S(){
        return 4*Math.PI*radius*radius;
    }

    public double V(){
        return (4.0 /3.0)*Math.PI*radius*radius*radius;
    }

    public void print(){
        System.out.println("Шар:");
        System.out.println("Радиус: "+radius);
    }
}
