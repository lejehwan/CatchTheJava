package doit자바프로그래밍.Chapter13.lambda;

interface PrintString{

    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {

        // 1
        PrintString lambdaPrint = str -> System.out.println(str);
        lambdaPrint.showString("This is Lambda");

        showMyString(lambdaPrint);

        PrintString reStr = returnPrint();
        reStr.showString("hello");
    }

    // 2
    public static void showMyString(PrintString lambda){
        lambda.showString("This is Lambda");
    }

    // 3
    public static PrintString returnPrint(){
        return s -> System.out.println(s + " world");
    }
}
