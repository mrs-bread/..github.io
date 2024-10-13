public class Ship {
    String name;
    double displacement;
    double length;
    double xCoordinate;
    double yCoordinate;
    double speed;

    public Ship(String name, double displacement, double length, double xCoordinate, double yCoordinate, double speed) {
        this.name = name;
        this.displacement = displacement;
        this.length = length;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.speed = speed;
    }

    public String toString(){
        return "Название: "+name+"\n Водоизмещение: "+displacement+"\n Длина: "+length+"\n Координата х: "+xCoordinate+"\n Координата у: "+yCoordinate+"\n Скорость: "+speed;
    }

    public void move(double dx, double dy) {
        xCoordinate += dx;
        yCoordinate += dy;
    }

    public double calculateDistanceTo(double targetX, double targetY) {
        return Math.sqrt(Math.pow(targetX - xCoordinate, 2) + Math.pow(targetY - yCoordinate, 2));
    }

    public void accelerate(double acceleration) {
        speed += acceleration;
    }

    public void decelerate(double deceleration) {
        speed -= deceleration;
        if (speed < 0) {
            speed = 0;
        }
    }

    public void changeCourse(double angle) {
        System.out.println("Курс изменен на " + angle + " градусов.");
    }

    public void stop() {
        speed = 0;
    }
    public void setName(String name){this.name=name;}
    public void setDisplacement(double displacement){this.displacement=displacement;}
    public void setLength(double length){this.length=length;}
    public void setxCoordinate(double xCoordinate){this.xCoordinate=xCoordinate;}
    public void setyCoordinate(double yCoordinate){this.yCoordinate=yCoordinate;}
    public void setSpeed(double speed){this.speed=speed;}
    public String getName(){return name;}
    public double getDisplacement(){return displacement;}
    public double getLength(){return length;}
    public double getxCoordinate(){return xCoordinate;}
    public double getyCoordinate(){return yCoordinate;}
    public double getSpeed(){return speed;}
}
