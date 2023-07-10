package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        //setter, getter method를 통해서 PersonVO 객체에 데이터를 저장한 후 출력하라.
        PersonVO vo = new PersonVO();
        vo.setName("홍길동");
        vo.setAge(50);
        vo.setPhone("010-1111-1111");
        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());

    }
}
