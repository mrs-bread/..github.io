public class MainShip {
    public static void main(String [] args){
        Ship ship1 = new Ship("Корабль 1", 10000, 150, 0, 0, 15);
        PassengerShip ship2 = new PassengerShip("Пассажирский корабль", 20000, 200, 10, 10, 10, 500, 10);
        Warship ship3 = new Warship("Военный корабль", 50000, 250, 20, 20, 25, 10, 10000);

        System.out.println("----------------------------------------");
        System.out.println("Информация о корабле: \n"+ship1.toString());
        System.out.println("----------------------------------------"+"\n Действия с кораблём 1:"+"\n----------------------------------------");
        System.out.println("Корабль 1: начальная скорость: " + ship1.getSpeed());
        ship1.move(10, 5);
        System.out.println("Корабль 1: смещение на (10, 5)");
        ship1.accelerate(5);
        System.out.println("Корабль 1: ускорение на 5");
        ship1.decelerate(3);
        System.out.println("Корабль 1: замедление на 3");
        ship1.changeCourse(45);
        ship1.stop();
        System.out.println("Корабль 1: остановка");

        System.out.println("----------------------------------------");
        System.out.println("Информация о корабле: \n"+ship2.toString());
        System.out.println("----------------------------------------"+"\n Действия с пассажирским кораблём:"+"\n----------------------------------------");
        System.out.println("Пассажирский корабль: начальное количество мест: " + ship2.getNumberOfSeats());
        ship2.embarkPassengers(200);
        System.out.println("Пассажирский корабль: посадка 200 пассажиров");
        ship2.disembarkPassengers(150);
        System.out.println("Пассажирский корабль: высадка 150 пассажиров");
        ship2.launchLifeboats(2);
        System.out.println("Пассажирский корабль: запуск 2 спасательных шлюпок");
        ship2.deployEmergencySystems();
        System.out.println("Пассажирский корабль: активация аварийных систем");

        System.out.println("----------------------------------------");
        System.out.println("Информация о корабле: \n"+ship3.toString());
        System.out.println("----------------------------------------"+"\n Действия с военным кораблём:"+"\n----------------------------------------");
        System.out.println("Военный корабль: атака цели (15, 15)");
        ship3.engageTarget(15, 15);
        System.out.println("Военный корабль: атака цели (10000, 10000)");
        ship3.engageTarget(10000, 10000);
        ship3.reloadGuns();
        System.out.println("Военный корабль: перезарядка орудий");
        ship3.deployTorpedoes();
        System.out.println("Военный корабль: запуск торпед");
        ship3.activateStealthMode();
        System.out.println("Военный корабль: активация режима невидимости");

    }
}
