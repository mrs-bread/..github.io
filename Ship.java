class Ship {
    private String name;
    private double weight;
    private double len;
    private double speed;
    private double x;
    private double y;
    private int maxPassengersCapacity;
    Ship(String name,double weight,double len,double x,double y,double speed,int maxPassengersCapacity) {
        this.name=name;
        this.weight=weight;
        this.len=len;
        this.x=x;
        this.y=y;
        this.speed=speed;
        this.maxPassengersCapacity=maxPassengersCapacity;
    }
    public String toString(){
        return "Name: "+name+"\n Weight: "+weight+"\n Length: "+len+"\n X: "+x+"\n Y: "+y+"\n Speed: "+speed+"\n Max Passengers: "+maxPassengersCapacity;
    }
    public String getName() {return name;}
    public double getWeight() {return weight;}
    public double getLen() {return len;}
    public double getX() {return x;}
    public double getY() {return y;}
    public double getSpeed() {return speed;}
    public int getMaxPassengersCapacity() {return maxPassengersCapacity;}
    public void setName(String name){this.name=name;}
    public void setWeight(double weight){this.weight=weight;}
    public void setLen(double len){this.len=len;}
    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}
    public void setSpeed(double speed){this.speed=speed;}
    public void setMaxPassengersCapacity(int MaxPassengersCapacity){this.maxPassengersCapacity=MaxPassengersCapacity;}
    public void move(){
        x+=speed;
        y+=speed;
    }
}
