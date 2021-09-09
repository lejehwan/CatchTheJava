package Chapter5.Q11;

import java.util.Scanner;

public class execute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수와 연산자를 입력하시오 >>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();
        Calc cal = null;
        switch (operator){
            case "+":
                cal = new Add();
                break;
            case "-":
                cal = new Sub();
                break;
            case "*":
                cal = new Mul();
                break;
            case "/":
                cal = new Div();
                break;
            default:
                break;
        }
        cal.setValue(a,b);
        int answer = cal.calculate();
        System.out.println(answer);
        scanner.close();
    }
}
