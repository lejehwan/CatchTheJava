package Chapter5.Q9;

public class StringStack implements Stack{

    private String[] stack;
    private int idx = 0;

    public StringStack(int size) {
        this.stack = new String[size];
    }

    @Override
    public int length() {
        return idx;
    }

    @Override
    public int capacity() {
        return stack.length;
    }

    @Override
    public String pop() {
        if (idx -1 > 0){
            return null;
        }
        idx--;
        String temp = stack[idx];
        return temp;
    }

    @Override
    public boolean push(String val) {
        if(idx < stack.length){
            stack[idx] = val;
            idx++;
            return true;
        }
        return false;
    }
}
