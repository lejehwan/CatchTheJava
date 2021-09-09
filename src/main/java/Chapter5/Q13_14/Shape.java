package Chapter5.Q13_14;

public interface Shape {

    final double PI = 3.14;// 상수
    void draw();// 도형을 그리는 추상 메서드
    double getArea();// 도형의 면적을 리턴하는 추상 메서드
    default public void redraw(){// 디폴트 메서드
        System.out.print("---다시 그립니다.");
        draw();
    }
}
