public class Warship extends Ship {
    int numberOfGuns;
    double maxRange;

    public Warship(String name, double displacement, double length, double xCoordinate, double yCoordinate, double speed, int numberOfGuns, double maxRange) {
        super(name, displacement, length, xCoordinate, yCoordinate, speed);
        this.numberOfGuns = numberOfGuns;
        this.maxRange = maxRange;
    }

    public String toString(){
        return super.toString()+"\n Количество орудий: "+numberOfGuns+"\n Максимальная дальность поражения: "+maxRange;
    }

    public boolean canHitTarget(double targetX, double targetY) {
        double distance = Math.sqrt(Math.pow(targetX - xCoordinate, 2) + Math.pow(targetY - yCoordinate, 2));
        return distance <= maxRange;
    }

    public double calculateDamage(double targetArmor) {
        return numberOfGuns * 1000 - targetArmor;
    }

    public void fire(double targetX, double targetY) {
        if (canHitTarget(targetX, targetY)) {
            System.out.println("Огонь по цели!");
        } else {
            System.out.println("Цель вне зоны поражения.");
        }
    }

    public void reloadGuns() {
        System.out.println("Орудия перезаряжены.");
    }

    public void deployTorpedoes() {
        System.out.println("Запущены торпеды.");
    }

    public void engageTarget(double targetX, double targetY) {
        //Атака цели, включающая проверку дальности и выстрел
        if (canHitTarget(targetX, targetY)) {
            fire(targetX, targetY);
        }
    }

    public void activateStealthMode() {
        System.out.println("Активирован режим невидимости.");
    }

    public void setNumberOfGuns(int numberOfGuns){this.numberOfGuns=numberOfGuns;}
    public void setMaxRange(double maxRange){this.maxRange=maxRange;}
    public int getNumberOfGuns(){return numberOfGuns;}
    public double getMaxRange(){return maxRange;}
}
