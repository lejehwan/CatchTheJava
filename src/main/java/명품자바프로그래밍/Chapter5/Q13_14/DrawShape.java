package 명품자바프로그래밍.Chapter5.Q13_14;

public class DrawShape {
    public static void main(String[] args) {
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20,30);
        list[2] = new Rect(10,40);
        for (Shape shape : list) {
            shape.redraw();
        }
        for (Shape shape : list) {
            System.out.println("면적은 " + shape.getArea());
        }
    }
}
