class Avto {
    private String marka;
    private String number;
    private String vin;
    private int year;
    private double vol;
    private int price;
    private int km;
    Avto(String marka,String number,String vin,int year,double vol,int price,int km)
    {
        this.marka=marka;
        this.number=number;
        this.vin=vin;
        this.year=year;
        this.vol=vol;
        this.price=price;
        this.km=km;
    }
    public String toString()
    {
        return "Марка: "+marka+"\n Номер: "+number+"\n Вин: "+vin+"\n Год: "+year+"\n Объем двигателя: "+vol+"\n Цена: "+price+"\n Пробег:"+km;
    }
    String getMarka(){return marka;}
    String getNumber(){return number;}
    String getVin(){return vin;}
    int getYear(){return year;}
    double getVol(){return vol;}
    int getPrice(){return price;}
    int getKm(){return km;}
}
