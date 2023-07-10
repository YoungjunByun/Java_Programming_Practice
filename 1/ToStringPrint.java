package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        //생성자 메서드를 통해 PersonVO 객체에 원하는 이름, 나이, 전화번호를 저장하고 toString()메서드로 출력하기
        PersonVO vo = new PersonVO("홍길동", 34, "010-2222-2222");
        System.out.println(vo.toString());
        System.out.println(vo); //이렇게만 적어도 vo.toString()을 자동적으로 찾아서 불러온다
    }
}
