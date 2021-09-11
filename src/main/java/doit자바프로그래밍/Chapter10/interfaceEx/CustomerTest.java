package doit자바프로그래밍.Chapter10.interfaceEx;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = new Customer();
        buyer.buy();

        Sell seller = new Customer();
        seller.sell();

        customer.order();
        buyer.order();
        seller.order();
    }
}
