import java.util.NoSuchElementException;
public class MyArrayListQueue {
    private final MyArrayList arrayList;

    public MyArrayListQueue() {
        this.arrayList = new MyArrayList();
    }


    public void enqueue(Object e){
        arrayList.add(e);
    }

    public Object dequeue(){
        exceptionCaller();
        Object temp = arrayList.get(0);
        arrayList.remove(0);
        return temp;
    }

    public Object peek(){
        exceptionCaller();
        return arrayList.get(0);
    }

    public boolean isEmpty(){
        return arrayList.size() == 0;
    }

    public int size(){
        return arrayList.size();
    }
    private void exceptionCaller(){
        if (arrayList.size() == 0){
            throw new NoSuchElementException();
        }
    }
}
