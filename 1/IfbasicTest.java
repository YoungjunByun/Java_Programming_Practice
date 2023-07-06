import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        //0인지 큰지 판단하라
        int x = -10;
        if(x>0){
            System.out.println("양수입니다");
        }


        //정수 1개 입력받아 7의 배수인지 출력하라.
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int num = scan.nextInt();
        if(num % 7 == 0){
            System.out.println("num = " + num + "은 7의 배수입니다.");
        }
        //나이를 입력 받아 19세 이상이면 성인임을 출력하는 코드를 작성하시오
        System.out.println("나이를 입력하세요:");
        int age = scan.nextInt();
        if(age>=19){
            System.out.println("성인입니다.");
        }
        System.out.println("종료");
    }
}
