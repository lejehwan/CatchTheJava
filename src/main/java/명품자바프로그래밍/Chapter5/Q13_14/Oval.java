package 명품자바프로그래밍.Chapter5.Q13_14;

public class Oval implements Shape{

    private int width;
    private int height;

    public Oval(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(" " + width + "*" +height + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return PI * width * height;
    }
}
