package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        //일반사원 한명의 객체를 생성하고 데이터를 저장 후 출력을 하시오
        RempVO vo = new RempVO("홍길동", 35, "010-232-233", "2022-11-11", "기획부", false);
        System.out.println(vo.toString());
    }
}
