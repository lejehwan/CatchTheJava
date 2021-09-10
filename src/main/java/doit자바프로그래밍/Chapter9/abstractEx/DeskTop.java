package doit자바프로그래밍.Chapter9.abstractEx;

public class DeskTop extends Computer{

    @Override
    public void display() {
        System.out.println("DeskTop display()");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing()");
    }

}
