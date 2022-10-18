package lt.techin.mantaspovilas.oop3;

public class Field {
    private double size;
    private int y1;
    private int x1;
    private int y2;
    private int x2;

    public Field(){

    }

    public Field(int height, int width){
        setHeight(height);
        setWidth(width);
    }

    public int getFieldArea(){
        return ((x2 - x1) * (y2 - y1));
    }
    public void isPointInAField(Point point){
        if (x1 >= point.getX() && x2 <= point.getX() && y1 >= point.getY() && y2 <= point.getY()){
            System.out.println("Point "+ point+" is in the field");
        } else {
            System.out.println("Point "+ point+" is not in the field");
        }
    }

    public void setWidth(int x1) {
        this.x1 = x1;
        this.x2 = -x1;
    }
    public void setHeight(int y1) {
        this.y1 = y1;
        this.y2 = -y1;
    }
    public double getSize() {
        return this.size;
    }

}
