package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장하시오
        int a = 10; // 기본자료형
        Integer aa = new Integer(10); // 사용자정의 자료형
        Integer aaa = 10; // Auto-boxing
        System.out.println(aa.intValue());
        System.out.println(aaa.intValue()); // Unboxing(Integer->int)

        Integer bb = new Integer(20);
        int b = bb; // Unboxing

        float f = 10.5f;
        Float ff = new Float(10.5f);
        System.out.println(ff.floatValue());

        Float fff = 45.6f; // Auto-boxing
        System.out.println(fff.floatValue());

        float aff = fff;


    }
}
