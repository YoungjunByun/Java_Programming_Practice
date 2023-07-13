package fc.java.model2;

import java.util.Arrays;

public class ObjectArray {
    private final int DEFAULT_CAPACITY = 5;
    private Object[] elements; // 다형성배열
    private int size = 0;
    // 생성동작
    public ObjectArray(){
        this(5);
    } // this(5) : 생성자 안에서 다른 생성자를 호출할때 사용
    // 저장하는 동작
    public ObjectArray(int capacity){
        elements = new Object[capacity];
    }

    public void add(Object element){
        // 크기체크
        if(size == elements.length){
            //크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    // 얻는 동작
    public Object get(int index){
        // index 체크
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index의 범위를 초가함");
        }
        return elements[index];
    }
    // 원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }

}
