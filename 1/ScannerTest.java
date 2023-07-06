import java.util.*; //java.util이라는 패키지(폴더)에 들어있는 Scanner라는 class를 사용하기 위해 import해준다
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = scan.nextInt(); //이때의 프로그램 = 블럭상태 = 잠시 멈춰있는 상태
        System.out.println("num = " + num);

        System.out.println("실수를 입력하세요 : ");
        float f = scan.nextFloat(); //이때의 프로그램 = 블럭상태 = 잠시 멈춰있는 상태
        System.out.println("f = " + f);

        System.out.println("문자열을 입력하세요 : ");
        String str = scan.next(); //이때의 프로그램 = 블럭상태 = 잠시 멈춰있는 상태
        System.out.println("str = " + str);

        scan.nextLine();    //버퍼 비우기(스트링 비우기)=>버퍼를 안비우면 아직 빨대에 내용물이 남게되어 다음 출력시 그 내용물이 출력된다
        System.out.println("문자열을 입력하세요 : ");
        String str1 = scan.nextLine(); //이때의 프로그램 = 블럭상태 = 잠시 멈춰있는 상태
        System.out.println("str1 = " + str1);

        scan.close();
    }
}
