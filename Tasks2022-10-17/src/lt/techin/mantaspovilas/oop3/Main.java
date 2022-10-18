package lt.techin.mantaspovilas.oop3;

public class Main {
    public static void main(String[] args) {
        Field f1 = new Field(20, 20);
        System.out.println(f1.getFieldArea());
        Point p1 = new Point(20, 20);
        System.out.println(p1.getLength());
        f1.isPointInAField(p1);
        Point p2 = new Point(40, 40);
        f1.isPointInAField(p2);
    }

}
