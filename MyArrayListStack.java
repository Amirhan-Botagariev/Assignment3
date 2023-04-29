import java.util.EmptyStackException;
public class MyArrayListStack {
    private final MyArrayList arrayList;

    public MyArrayListStack() {
        this.arrayList = new MyArrayList();
    }

    public void push(Object e){
        arrayList.add(e);
    }

    public Object pop(){
        Object temp = arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
        return temp;
    }

    public Object peek(){
        return arrayList.get(arrayList.size()-1);
    }

    public boolean isEmpty(){
        return arrayList.size() == 0;
    }

    public int size(){
        return arrayList.size();
    }
}
