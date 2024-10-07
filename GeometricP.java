class GeometricP extends Progression {
    GeometricP(int[]a)
    {super(a);}
    double sum(){
        return (a[0]*Math.pow(a[1],a[2])-1)/(a[1]-1);
    }
    double element(){
        return a[0]*Math.pow(a[1],a[2]-1);
    }
}
