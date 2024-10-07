class ArithmeticP extends Progression {
    ArithmeticP(int[]a)
    {super(a);}
    double sum(){
        return a[0]*a[2]+ (double) (a[1] * (a[2] - 1) * a[2]) /2;
    }
    double element(){
        return a[0]+a[1]*(a[2]-1);
    }
}
