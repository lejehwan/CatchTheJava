package 명품자바프로그래밍.Chapter5.Q10;

class Dictionary extends PairMap {

    private int count = 0;

    public Dictionary(int num) {
        keyArray = new String[num];
        valueArray = new String[num];
        count = 0;
    }

    @Override
    String get(String key) {
        for (int i = 0; i < keyArray.length; i++) {
            if (key.equals(keyArray[i])) {
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for (int i = 0; i < keyArray.length; i++) {
            if (key.equals(keyArray[i])) {
                valueArray[i] = value;
                return;
            }
        }
        keyArray[count] = key;
        valueArray[count] = value;
        count++;
    }

    @Override
    String delete(String key) {
        for (int i = 0; i < keyArray.length; i++) {
            if (key.equals(keyArray[i])) {
                String returnDeleteValue = valueArray[i];
                keyArray[i] = null;
                valueArray[i] = null;
                count--;
                return returnDeleteValue;
            }
        }
        return null;
    }

    @Override
    int length() {
        return count + 1;
    }
}
