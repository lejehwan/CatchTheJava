package doit자바프로그래밍.Chapter10.interfaceEx;

public class Customer implements Buy, Sell{

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() {

    }

    @Override
    public void sell() {
        System.out.println("고객 판매 주문");
    }
}
