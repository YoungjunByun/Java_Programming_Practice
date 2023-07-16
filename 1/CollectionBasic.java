package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 10, 20, 30, 40, 50 5개의 정수(int)를 저장하고 출력하시오
        // ArrayList에는 객체자료형만 넣을 수 있으므로 int 자체로는 못넣고 Integer(Wrapper)로 넣어야한다.
        // 헌데 사실은 int자체로 넣으려하면 시스템 자체적으로 int->Integer로 Auto-boxing이 이루어진다.
        ArrayList<Integer> list = new ArrayList<Integer>();
        //list.add(new Integer(10));
        list.add(10); // new Integer(10)으로 auto-boxing이 이루어진다.
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Integer -> int : Auto-unboxing
        for(int data : list){
            System.out.println(data);
        }
    }
}
