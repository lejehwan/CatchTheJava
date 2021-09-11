package doit자바프로그래밍.Chapter10.interfaceEx;

public interface Sell {

    void sell();
    
    default void order(){
        System.out.println("판매주문");
    }
}
