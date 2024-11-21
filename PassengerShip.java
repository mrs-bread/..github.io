public class PassengerShip extends Ship {
    int numberOfSeats;
    int numberOfLifeboats;

    public PassengerShip(String name, double displacement, double length, double xCoordinate, double yCoordinate, double speed, int numberOfSeats, int numberOfLifeboats) {
        super(name, displacement, length, xCoordinate, yCoordinate, speed);
        this.numberOfSeats = numberOfSeats;
        this.numberOfLifeboats = numberOfLifeboats;
    }

    public String toString(){
        return super.toString()+"\n Количество мест: "+numberOfSeats+"\n Количество спасательных шлюпок: "+numberOfLifeboats;
    }
    public int calculateNumberOfSavedPassengers() {
        return numberOfLifeboats * 10; // Предположим, что каждая шлюпка вмещает 10 человек
    }

    public boolean isOvercrowded() {
        return numberOfSeats > 1000; // Например, если количество мест больше 1000
    }

    public double getPassengerDensity() {
        return numberOfSeats / displacement; // Пассажиров на единицу водоизмещения
    }

    public void embarkPassengers(int numPassengers) {
        //Посадка пассажиров
        numberOfSeats += numPassengers;
    }

    public void disembarkPassengers(int numPassengers) {
        //Высадка пассажиров
        numberOfSeats -= numPassengers;
        if (numberOfSeats < 0) {
            numberOfSeats = 0;
        }
    }

    public void launchLifeboats(int numLifeboats) {
        //Запуск спасательных шлюпок
        numberOfLifeboats -= numLifeboats;
        if (numberOfLifeboats < 0) {
            numberOfLifeboats = 0;
        }
    }

    public void deployEmergencySystems() {
        // Активация аварийной системы
        System.out.println("Активированы аварийные системы.");
    }

    public void setNumberOfSeats(int numberOfSeats){this.numberOfSeats=numberOfSeats;}
    public void setNumberOfLifeboats(int numberOfLifeboats){this.numberOfLifeboats=numberOfLifeboats;}
    public int getNumberOfSeats(){return numberOfSeats;}
    public int getNumberOfLifeboats(){return numberOfLifeboats;}
}
