class Ball extends Telo {
    Ball(int[]a)
    {super(a);}
    double s(){
        return 4*Math.PI*a[0]*a[0];
    }
    double v(){
        return (4*Math.PI*a[0]*a[0]*a[0])/3;
    }

}
