public class Point {
    private int x,y;
    Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
    double dist(Point p) {
        int dx = x - p.getX();
        int dy = y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    void Print() {
        System.out.print("Точка с координатами (" + x + ";" + y + ")");
    }
}
