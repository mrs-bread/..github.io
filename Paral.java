public class Paral extends Telo{
    Paral(int[]a){
        super(a);
    }
    double s(){
        return 2*(a[0]*a[1]+a[2]*a[1]+a[0]*a[2]);
    }
    double v(){
        return a[0]*a[1]*a[2];
    }
}
