# MyArrayListStack and MyLinkedListStack 
## There are 5 methods
## 1. Method push(Object e)
## 2. Method pop()
## 3. Method peek()
## 4. Method isEmpty()
## 5. Method size()
# MyArrayListStack
## Fields
```java
private final MyArrayList arrayList;
```
## Constructor
```java
public MyArrayListStack() {
        this.arrayList = new MyArrayList();
    }
```    
## 1. Method push(Object e)
```java
public void push(Object e){
        arrayList.add(e);
    }
```
### Add object e to the end of the arraylist using method add(Object e)
## 2. Method pop()
```java
public Object pop(){
        Object temp = arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
        return temp;
    }
```
### Add object to the variable temp, then remove it from the arraylist, and finally return temp
## 3. Method peek()
```java
public Object peek(){
        return arrayList.get(arrayList.size()-1);
    }
```
### Return last element of the arraylist using method get()
## 4. Method isEmpty()
```java
public boolean isEmpty(){
        return arrayList.size() == 0;
    }
```
### Return true or false whether size of the arraylist equals 0
## 5. Method size()
```java
public int size(){
        return arrayList.size();
    }
```
### Return size of the arraylist using method size()

# MyLinkedListStack

## Fields
```java
private final MyLinkedList linkedList;
```
## Constructor
```java
public MyLinkedListStack() {
        this.linkedList = new MyLinkedList();
    }
```  

## 1. Method push(Object e)
```java
public void push(Object e){
        linkedList.addFirst(e);
    }
    
public void addFirst(Object value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

```
### Add object e to the head of the linkedlist using method addFirst()
## 2. Method pop()
```java
public Object pop(){
        if (size() == 0){
            throw new EmptyStackException();
        }
        Object temp = linkedList.getFirst();
        linkedList.removeFirst();
        return temp;
    }
    

```
### It checks whether size == 0, if yes it throws an exception, otherwise, it storage data of the head in the temp, then remove the first node using method removeFirst(), and finally return the temp.
## 3. Method peek()
```java
public Object peek(){
        if (size() == 0){
            throw new EmptyStackException();
        }
        return linkedList.getFirst();
    }

public Object getFirst(){
        return head.data;
    }
```
### Checks if the size is zero, if yes it throws an exception, otherwise if returns data of the head using method getFirst()
## 4. Method isEmpty()
```java
public boolean isEmpty(){
        return linkedList.size() == 0;
    }
```
### Return true or false whether size of the linkedlist equals 0
## 5. Method size()
```java
public int size(){
        return linkedList.size();
    }
```
### Return size of the arraylist using method size()


# MyArrayListQueue and MyLinkedListQueue  
## There are 5 methods
## 1. Method enqueue(Object e)
## 2. Method dequeue()
## 3. Method peek()
## 4. Method isEmpty()
## 5. Method size()
## 6. exceptionCaller()

# MyArrayListQueue

## Fields
```java
private final MyArrayList arrayList;
```
## Constructor
```java
public MyArrayListQueue() {
        this.arrayList = new MyArrayList();
    }
```  

## 1. Method enqueue(Object e)
```java
public void enqueue(Object e){
        arrayList.add(e);
    }
```
### Add object e to the end of the arraylist using method add(Object e)
## 2. Method dequeue()
```java
public Object dequeue(){
        exceptionCaller();
        Object temp = arrayList.get(0);
        arrayList.remove(0);
        return temp;
    }
```
### It checks whether the size of the arraylist equals 0. Then it adds object to the variable temp, then remove it from the arraylist, and finally return temp
## 3. Method peek()
```java
public Object peek(){
        exceptionCaller();
        return arrayList.get(0);
    }
```
### It checks whether the size of the arraylist equals 0. Return first element of the arraylist using method get()
## 4. Method isEmpty()
```java
public boolean isEmpty(){
        return arrayList.size() == 0;
    }
```
### Return true or false whether size of the arraylist equals 0
## 5. Method size()
```java
public int size(){
        return arrayList.size();
    }
```
### Return size of the arraylist using method size()
## 6. Method exceptionCaller()
```java
private void exceptionCaller(){
        if (arrayList.size() == 0){
            throw new NoSuchElementException();
        }
    }
```
### Checks whether size of the arraylist equals 0. If yes, it throws an exception.

# MyLinkedListQueue

## Fields
```java
private final MyLinkedList linkedList;
```
## Constructor
```java
public MyLinkedListQueue() {
        this.linkedList = new MyLinkedList();
    }
```  

## 1. Method enqueue(Object e)
```java
public void enqueue(Object e){
        linkedList.addLast(e);
    }
    
public void addLast(Object e){
        Node newNode = new Node(e);
        if (tail == null){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
```
### Add object e to the end of the linkedlist using method addLast(Object e)
## 2. Method dequeue()
```java
public Object dequeue(){
        exceptionCaller();
        Object temp = linkedList.getFirst();
        linkedList.removeFirst();
        return temp;
    }

public Object getFirst(){
        return head.data;
    }
```
### It checks whether the size of the arraylist equals 0. Then it adds object to the variable temp using method getFirst(), then remove it from the arraylist, and finally return temp
## 3. Method peek()
```java
public Object peek(){
        exceptionCaller();
        return linkedList.getFirst();
    }
```
### It checks whether the size of the arraylist equals 0. Return first element using method getFirst() of the arraylist using method get()
## 4. Method isEmpty()
```java
public boolean isEmpty(){
        return linkedList.size() == 0;
    }
```
### Return true or false whether size of the linkedlist equals 0
## 5. Method size()
```java
public int size(){
        return linkedList.size();
    }
```
### Return size of the linkedlist using method size()
## 6. Method exceptionCaller()
```java
private void exceptionCaller(){
        if (linkedList.size() == 0){
            throw new NoSuchElementException();
        }
    }
```
### Checks whether size of the linkedlist equals 0. If yes, it throws an exception.







