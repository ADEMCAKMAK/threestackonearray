import java.io.Serializable;

public class NStack<Integer> implements Stack<Integer> {

    private Integer[] array = (Integer[]) new Object[15];
    private int[] start = { 0,5,10 },
            end = { 5, 10, 15 },
            current = { 0, 0, 0 };
    private int numOfStack = 3;
    private int size = 5;

    public Integer[] getArray() {
        return array;
    }

    @Override
    public boolean empty(int num) {
        return current[num] == 0;
    }

    @Override
    public boolean full(int num) {
        return current[num] == size;
    }

    @Override
    public Integer peek(int num) {
        return array[ start[num]+current[num]-1 ];
    }

    @Override
    public Integer pop(int num) {
        Integer t = array[ start[num]+current[num]-1 ];
        array[ start[num]+current[num]-1 ] = null;
        current[num]--;
        return t;
    }

    @Override
    public Integer push(int num, Integer value) {
        if( full(num) )
            return null;
        array[ start[num]+current[num] ] = value;
        current[num]++;
        return array[ start[num]+current[num]-1 ];
    }

    @Override
    public int search(int num, Integer value) {
        return 0;
    }
}
