package 명품자바프로그래밍.Chapter5.Q13_14;

public class Rect implements Shape{

    private int width;
    private int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(" " + width + "*" + height + "크기의 사각형 입니다.");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
