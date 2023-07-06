import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = -10;
        if(x>=0) {
            System.out.println("0 or 양수입니다.");
        }else{
            System.out.println("음수입니다.");
        }
        //정수 1개 입력받아 짝수인지 홀수인지 판단
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int su = scan.nextInt();
        if(su%2 == 0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }

        //입력받은 수가 12의 배수인지 출력하라.
        System.out.println("정수를 입력하세요 : ");
        int num = scan.nextInt();
        if(num%12 == 0){
            System.out.println("12의 배수입니다.");
        }else{
            System.out.println("12의 배수가 아닙니다.");
        }

        //년도를 입력받아서 해당 년도가 윤년인지 아닌지를 판단하는 코드 작성하시오
        System.out.println("연도를 입력하세요 : ");
        int year = scan.nextInt();
        if((year%4 == 0 && year%100 != 0) || year % 400 == 0){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }

    }
}
