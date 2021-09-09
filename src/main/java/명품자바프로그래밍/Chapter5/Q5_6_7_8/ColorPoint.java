package 명품자바프로그래밍.Chapter5.Q5_6_7_8;

public class ColorPoint extends Point{

    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
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
