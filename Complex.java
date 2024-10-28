public class Complex implements Pair{
    private int re;
    private int im;
    Complex(int re,int im){
        this.re=re;
        this.im=im;
    }
    public int getOne(){return re;}
    public int getTwo(){return im;}
    public Pair add(Pair p){
        Complex c=new Complex(re+p.getOne(),im+p.getTwo());
        return c;
    }
    public Pair sub(Pair p){
        Complex c=new Complex(re-p.getOne(),im-p.getTwo());
        return c;
    }
    public Pair mul(Pair p){
        Complex c=new Complex(re*p.getOne()+im*p.getTwo()*(-1),re* p.getTwo()+im*getOne());
        return c;
    }
    public Pair del(Pair p){
        Complex c=new Complex((re*p.getOne()+im*p.getTwo())/(p.getOne()*p.getOne()+p.getTwo()* p.getTwo()),(p.getOne()*im-re*p.getTwo())/(p.getOne()*p.getOne()+ p.getTwo()* p.getTwo()));
        return c;
    }
    public void print(){
        System.out.println("re: "+re+" im:"+im);
    }
}
