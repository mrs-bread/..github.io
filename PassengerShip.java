class PassengerShip extends Ship{
    private int passengerCapacity;
    private int boats;
    PassengerShip(String name,double weight,double len,double x,double y,double speed,int passengerCapacity, int maxPassengerCapacity, int boats) {
        super(name,weight,len,x,y,speed,maxPassengerCapacity);
        this.passengerCapacity = passengerCapacity;
        this.boats = boats;
    }
    public int SavePassengers(){
        return 10*boats;
    }
    public int getPassengerCapacity() { return passengerCapacity; }
    public int getBoats() { return boats; }
    public void setPassengerCapacity(int passengerCapacity) { this.passengerCapacity = passengerCapacity;}
    public void setBoats(int boats) { this.boats = boats; }
}
