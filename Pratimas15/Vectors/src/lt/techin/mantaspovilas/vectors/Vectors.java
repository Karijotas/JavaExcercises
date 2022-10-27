package lt.techin.mantaspovilas.vectors;

public class Vectors {
    private int x;
    private int y;

    private int z;

    private double length;
    private static int pointCounter;
    private final int pointNumber;


    public Vectors() {
        this(0, 0, 0);
    }

    public Vectors(int x, int y, int z) {
        setX(x);
        setY(y);
        setZ(z);
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
        countLength();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.x);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        sb.append(this.z);
        sb.append(")");
        return sb.toString();
    }


    private void countLength() {
        length = Math.sqrt(x * x + y * y);
    }

    public double distanceTo(Vectors point) {
        return Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
    }

    public void scalarMultiplication(Vectors vector) {
        System.out.println("Vektorių sandauga: " + (this.getX() * this.getY()) + (vector.getX() * vector.getZ()) + (this.getZ() * vector.getZ()));
    }


    public double getLength() {
        return length;
    }

    public static int getPointCounter() {
        return pointCounter;
    }
}

