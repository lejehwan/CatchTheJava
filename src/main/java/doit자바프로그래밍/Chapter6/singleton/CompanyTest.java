package doit자바프로그래밍.Chapter6.singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        Company company = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company);
        System.out.println(company2);
        // company == company2

        Calendar cal = Calendar.getInstance();
    }
}
