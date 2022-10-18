package lt.techin.mantaspovilas.oop3;

public class Point {
    private int x;
    private int y;

    private double length;
    private static int pointCounter;
    private final int pointNumber;


    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
        pointNumber = pointCounter++;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        countLength();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        countLength();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.x);
        sb.append(", ");
        sb.append(this.y);
        sb.append(")");
        return sb.toString();
    }


    private void countLength(){
        length = Math.sqrt(x * x + y * y);
    }

    public double distanceTo(Point point){
        return Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
    }

    public double getLength() {
        return length;
    }

    public static int getPointCounter() {
        return pointCounter;
    }
}
