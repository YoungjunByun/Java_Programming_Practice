import java.util.*;
public class MaxMinValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("a를 입력하세요 : ");
        int a = scan.nextInt();

        scan.nextLine();

        System.out.println("b를 입력하세요 : ");
        int b = scan.nextInt();

        int min = (a<b) ? a : b;
        System.out.println("min = " + min);

        int max = (a>b) ? a : b;
        System.out.println("max = " + max);

        scan.close();
    }
}
