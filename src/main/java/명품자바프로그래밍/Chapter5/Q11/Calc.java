package 명품자바프로그래밍.Chapter5.Q11;

public abstract class Calc {

    protected int a;
    protected int b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    abstract int calculate();
}
