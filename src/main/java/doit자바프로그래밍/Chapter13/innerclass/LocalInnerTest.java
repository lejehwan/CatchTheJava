package doit자바프로그래밍.Chapter13.innerclass;

class Outer{

    int outNum = 100;
    static int sNum = 200;

    // 익명 내부 클래스 -> 단 하나의 추상클래스나 단 하나의 인터페이스만 구현 가능
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("runnable");
        }
    };

    public Runnable getRunnable(){

        int localNum = 100;

        return new Runnable() {
            @Override
            public void run() {

            }
        };

//        class MyRunnable implements Runnable{
//
//            @Override
//            public void run() {
//
//
//                System.out.println(outNum);
//                System.out.println(sNum);
//                System.out.println(localNum);
//            }
//        }
//        return new MyRunnable();
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable();
        runnable.run();

        outer.runnable.run();
    }
}
