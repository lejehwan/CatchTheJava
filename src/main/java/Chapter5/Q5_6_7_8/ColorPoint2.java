package Chapter5.Q5_6_7_8;

public class ColorPoint2 extends Point{

    private String color;

    public ColorPoint2() {
        super(0,0);
        this.color = "BLACK";
    }

    public ColorPoint2(int x, int y) {
        super(x, y);
    }

    public void setXY(int x, int y){
        move(x,y);
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "색의 (" + getX() + "," + getY() + ")의 점";
    }
}
