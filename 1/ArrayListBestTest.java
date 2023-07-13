package fc.java.course2.part1;

import fc.java.model2.Book;

import java.util.*;

public class ArrayListBestTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요.
        //List는 ArrayList의 부모이다.
        //Generic(<...>)을 사용시 downcasting을 할 필요가 사라진다. 즉, downcasting을 하지 않아도 된다는 말. 왜냐하면 미리 어떤걸 가리키는지 결정을 한 상태이기 때문이다.
        List<Book> list = new ArrayList<Book>(); // 기본 크기 : 10인 Object[]
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 11000, "대림", "나길동"));
        list.add(new Book("파이썬", 10000, "정보", "김길동"));

        Book vd = list.get(0);
        System.out.println(vd.toString());

        vd = list.get(1);
        System.out.println(vd.toString());

        vd = list.get(2);
        System.out.println(vd.toString());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)); // Object->Book(JVM에서 자동으로 Book의 toString()호출
        }
    }
}
