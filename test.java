public class test {
    public static void main(String[] args) {
        MyArrayListQueue stack = new MyArrayListQueue();

        stack.enqueue(1);
        stack.enqueue(2);
        stack.enqueue(3);

        System.out.println(stack.dequeue());
        System.out.println(stack.peek());

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.isEmpty());

    }
}
