package doit자바프로그래밍.Chapter13.lambda;

public class MyNumberTest {
    public static void main(String[] args) {

        MyNumber maxNum = (x, y) -> (x >= y) ? x : y;
        int max = maxNum.getMaxNumber(10,20);
        System.out.println(max);

//        // 내부 익명 클래스
//        MyNumber aaa = new MyNumber() {
//            @Override
//            public int getMaxNumber(int num1, int num2) {
//                return 0;
//            }
//        };
    }
}
