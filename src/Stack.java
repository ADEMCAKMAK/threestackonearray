public interface Stack<T> {

    boolean empty(int num);
    boolean full(int num);
    T peek(int num);
    T pop(int num);
    T push(int num, T value);
    int search(int num, T value);
}
