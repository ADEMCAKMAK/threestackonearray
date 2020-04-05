import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        NStack<Integer> nStack = new NStack<>();

        test(0, nStack);
        test(2, nStack);
        test(1, nStack);
    }

    public static void test(int num, NStack<Integer> nStack){

        System.out.println(String.format("stack number: %d isEmpty : %s", num, nStack.empty(num)));
        System.out.println(String.format("stack number: %d isFull : %s", num, nStack.full(num)));
        System.out.println(String.format("stack number: %d push : %s", num, nStack.push(num, 4)));
        System.out.println(Arrays.toString(nStack.getArray()));
        System.out.println(String.format("stack number: %d isEmpty : %s", num, nStack.empty(num)));
        System.out.println(String.format("stack number: %d push : %s", num, nStack.push(num, 7)));
        System.out.println(Arrays.toString(nStack.getArray()));
        System.out.println(String.format("stack number: %d peek : %s", num, nStack.peek(num)));
        System.out.println(String.format("stack number: %d pop : %s", num, nStack.pop(num)));
        System.out.println(Arrays.toString(nStack.getArray()));
        System.out.println(String.format("stack number: %d peek : %s", num, nStack.peek(num)));
        System.out.println(Arrays.toString(nStack.getArray()));
    }
}
