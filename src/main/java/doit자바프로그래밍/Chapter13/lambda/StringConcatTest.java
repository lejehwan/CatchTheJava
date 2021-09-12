package doit자바프로그래밍.Chapter13.lambda;

public class StringConcatTest {
    public static void main(String[] args) {

        // 객체지향 프로그래밍 방식
        StringConcatImpl slImpl = new StringConcatImpl();
        slImpl.makeString("hello", "java");

        // 람다식(함수형 프로그래밍 방식) 이용
        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
        concat.makeString("hello", "java");
        
        // 익명 내부 클래스 이용
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };
        concat2.makeString("hello", "java");
    }
}
