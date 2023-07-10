package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        //객체배열을 이용하여 4명의 학생 데이터를 저장하고 출력하시오
        Student[] std = new Student[4];
        std[0] = new Student("홍길동", "컴공", 33, "dfd@naver.com", 202020, "010-23423-2323");
        std[1] = new Student("홍길동", "컴공", 33, "dfd@naver.com", 202020, "010-23423-2323");
        std[2] = new Student("홍길동", "컴공", 33, "dfd@naver.com", 202020, "010-23423-2323");
        std[3] = new Student("홍길동", "컴공", 33, "dfd@naver.com", 202020, "010-23423-2323");
        for(int i = 0; i<std.length;i++){
            System.out.println(std[i].toString());
        }
        for(Student st : std){
            System.out.println(st.toString());
        }

    }
}
