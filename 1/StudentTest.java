package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        //정수 6개를 저장할 배열을 생성하시오
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        Student vo = new Student("홍길동", "컴퓨터공학과", 32, "bit@empas.com", 2023220, "010-233-333");
        System.out.println(vo.toString());
    }
}
