package doit자바프로그래밍.Chapter6.singleton;

public class Company {

    // 기본 생성자와 static 변수를 사용한 객체를 private로 선언

    private static Company instance = new Company();

    private Company(){}

    // getInstance() 메서드로 접근해야 함

    public static Company getInstance(){
        if (instance == null){
            instance = new Company();
        }
        return instance;
    }
}
