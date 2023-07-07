public class MethodMakeTest {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int result = add(a, b);
        System.out.println("result = " + result);
    }
    //매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 정의하라
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
