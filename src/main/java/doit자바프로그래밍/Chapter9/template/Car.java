package doit자바프로그래밍.Chapter9.template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();
    public void washCar(){}// 훅 메서드 : 구현 코드는 없지만 필요에 의해 재정의 하여 구현해 사용가능

    public void startCar(){
        System.out.println("시동을 킵니다");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다");
    }

    // 프로그램의 일련의 과정의 시나리오 를 정하는 메서드(final, 바뀌면 안됨)
    public final void run(){
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }
}
