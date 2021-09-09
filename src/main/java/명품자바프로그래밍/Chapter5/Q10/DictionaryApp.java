package 명품자바프로그래밍.Chapter5.Q10;

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "c++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        String deleteValue = dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        System.out.println("삭제된 값은 " + deleteValue);
        System.out.println("저장된 아이템의 개수는 " + dic.length());
    }
}
