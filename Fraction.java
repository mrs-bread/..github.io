public class Fraction implements Pair {
    private int ch;
    private int zn;
    Fraction(int ch,int zn){
        this.ch=ch;
        this.zn=zn;
    }
    public int getOne(){return ch;}
    public int getTwo(){return zn;}
    public Pair add(Pair f){
        Fraction c=new Fraction(ch*f.getTwo()+f.getOne()*zn,zn* f.getTwo());
        return c;
    }
    public Pair sub(Pair f){
        Fraction c=new Fraction(ch*f.getTwo()-f.getOne()*zn,zn* f.getTwo());
        return c;
    }
    public Pair mul(Pair f){
        Fraction c=new Fraction(ch*f.getOne(),zn*f.getTwo());
        return c;
    }
    public Pair del(Pair f){
        Fraction c=new Fraction(ch*f.getTwo(),zn*f.getOne());
        return c;
    }
    public void print(){
        System.out.println("ch: "+ch+" zn: "+zn);
    }

}
