package 명품자바프로그래밍.Chapter5.Q5_6_7_8;

public class Point {

    private int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y= y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    protected void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}
