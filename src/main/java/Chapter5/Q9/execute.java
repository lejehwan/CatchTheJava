package Chapter5.Q9;

import java.util.Scanner;

public class execute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("총 스택 저장 공간의 크기 입력 >> ");
        int size = scanner.nextInt();
        StringStack ss = new StringStack(size);
        while (true){
            System.out.println("문자열 입력");
            String temp = scanner.next();
            if (temp.equals("그만")){
                break;
            }
            if (!ss.push(temp)){
                System.out.println("스택이 꽉 차서 푸시 불가");
            }
        }
        System.out.println("스택에 저장된 모든 문자열 팝: ");
        for(int i = 0; i < ss.length(); i++){
            System.out.println(ss.pop() + " ");
        }
        scanner.close();
    }
}
