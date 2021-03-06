package 명품자바프로그래밍.Chapter5.Q5_6_7_8;

public class Point3D extends Point {

    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void moveUp() {
        z++;
    }

    public void moveDown() {
        z--;
    }

    public void move(int x, int y, int z) {
        move(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")의 점";
    }
}
