package 명품자바프로그래밍.Chapter5.Q1_2;

public class ColorTV extends TV{

    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    public void printProperty(){
        System.out.println(getSize() + "인치 " + color + "컬러");
    }
}
