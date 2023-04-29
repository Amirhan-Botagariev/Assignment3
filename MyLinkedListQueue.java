import java.util.NoSuchElementException;

public class MyLinkedListQueue {
    private final MyLinkedList linkedList;

    public MyLinkedListQueue() {
        this.linkedList = new MyLinkedList();
    }


    public void enqueue(Object e){
        linkedList.addLast(e);
    }

    public Object dequeue(){
        exceptionCaller();
        Object temp = linkedList.getFirst();
        linkedList.removeFirst();
        return temp;
    }

    public Object peek(){
        exceptionCaller();
        return linkedList.getFirst();
    }

    public boolean isEmpty(){
        return linkedList.size() == 0;
    }

    public int size(){
        return linkedList.size();
    }

    private void exceptionCaller(){
        if (linkedList.size() == 0){
            throw new NoSuchElementException();
        }
    }
}
