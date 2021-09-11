package doit자바프로그래밍.Chapter10.bookshelf;

public interface Queue {

    void enQueue(String title);
    String deQueue();
    int getSize();
}
