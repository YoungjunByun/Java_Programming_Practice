package fc.java.course2.part1;

import fc.java.model2.Book;
import fc.java.model2.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        // 책 3권의 데이터를 배열에 저장하고 출력하세요
        BookArray list = new BookArray();
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 11000, "대림", "나길동"));
        list.add(new Book("파이썬", 10000, "정보", "김길동"));

        Book vo = list.get(0);
        System.out.println(vo); // vo.toString()이 생략된 꼴

        vo = list.get(1);
        System.out.println(vo); // vo.toString()이 생략된 꼴

        vo = list.get(2);
        System.out.println(vo); // vo.toString()이 생략된 꼴

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
