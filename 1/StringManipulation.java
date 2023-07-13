package fc.java.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        //String class 조작하기
        String str = "HelloWorld";
        System.out.println(str.charAt(1)); // 'e'
        System.out.println(str.replaceAll("o", "x")); // HellxWxrld
        System.out.println(str.length()); // 10
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5)); // World
        System.out.println(str.substring(5, 8)); // Wor
        System.out.println(str.indexOf("W")); // 5(만약 없으면 -1로 출력)
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }

    }
}
