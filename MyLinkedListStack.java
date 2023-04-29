import java.util.EmptyStackException;

public class MyLinkedListStack {
    private final MyLinkedList linkedList;

    public MyLinkedListStack() {
        this.linkedList = new MyLinkedList();
    }

    public void push(Object e){
        linkedList.addFirst(e);
    }

    public Object pop(){
        if (size() == 0){
            throw new EmptyStackException();
        }
        Object temp = linkedList.getFirst();
        linkedList.removeFirst();
        return temp;
    }

    public Object peek(){
        if (size() == 0){
            throw new EmptyStackException();
        }
        return linkedList.getFirst();
    }

    public boolean isEmpty(){
        return linkedList.size() == 0;
    }

    public int size(){
        return linkedList.size();
    }
}
