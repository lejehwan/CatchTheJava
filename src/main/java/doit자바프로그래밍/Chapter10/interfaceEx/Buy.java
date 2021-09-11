package doit자바프로그래밍.Chapter10.interfaceEx;

public interface Buy {

    void buy();

    default void order(){
        System.out.println("구매주문");
    }
}
