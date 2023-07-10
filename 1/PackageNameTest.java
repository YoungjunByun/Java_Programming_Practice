package fc.java.part3;
//import java.lang.*; 이게 default package로 생략되어있다.
import java.util.*;
import fc.java.model.*;

public class PackageNameTest {
    public static void main(String[] args) {
        //지금까지 자바에서 제공해주어서 사용해본 클래스들의 이름을 적어보자
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");

        CarDTO car = new CarDTO();
        CarDAO dao = new CarDAO();
    }
}
