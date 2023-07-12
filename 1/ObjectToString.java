package fc.java.part4;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글입니다.");
        System.out.println(b.toString()); //fc.java.poly.Board@7a79be86 -> 게시글입니다
        System.out.println(b); //toString()이 생략되어있는 꼴 : fc.java.poly.Board@7a79be86 -> 게시글입니다

    }
}
