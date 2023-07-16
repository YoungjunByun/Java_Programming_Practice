package fc.java.course2.part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1 + str2); // + = Concatenation
        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println("sum = " + sum);

        int su1 = 123;
        int su2 = 123;
        System.out.println(su1 + su2);
        String str = String.valueOf(su1) + String.valueOf(su2);
        System.out.println("str = " + str);
        String str10 = ""+ su1 +su2;
        System.out.println("str10 = " + str10);
    }
}
