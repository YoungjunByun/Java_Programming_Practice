package fc.java.model2;

import java.util.Arrays;
public class IntArray {
    private final int DEFAULT_CAPACITY = 5;
    private int[] elements;
    private int size = 0;
    // 생성동작
    public IntArray(){
        elements = new int[DEFAULT_CAPACITY];
    }
    // 저장하는 동작
    public void add(int element){
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
    public int get(int index){
        // index 체크
        return elements[index];
    }
    // 원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }

}
