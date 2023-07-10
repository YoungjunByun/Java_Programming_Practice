package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int sum = MyUtil.hap(a, b); //글꼴이 기울어진 method들은 다 static method들이다
        System.out.println("sum = " + sum);
    }
}
