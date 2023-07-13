package fc.java.course2.part1;

public class HelloWorldString {
    public static void main(String[] args) {
        String str = new String("HelloWorld"); // Heap memory
        System.out.println(str.toString());

        String str1 = "HelloWorld"; // Literal pool memory
        System.out.println(str1.toString());
    }
}
