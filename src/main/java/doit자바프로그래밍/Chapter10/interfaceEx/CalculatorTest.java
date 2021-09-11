package doit자바프로그래밍.Chapter10.interfaceEx;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));

        // default method
        calc.description();

        // static method
        int[] arr = {1,2,3,4,5};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}
