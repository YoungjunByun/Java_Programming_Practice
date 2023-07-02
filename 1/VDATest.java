public class VDATest {
    public static void main(String[] args){
        int a = 10;
        System.out.println("a = " + a);
        int b = a;
        int c = b*10;
        System.out.println("c = " + c);
        int sum = 0;
        for(int i=1; i<5000; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);

        int x = 10; int y = 20; int tmp;
        tmp = x;
        x = y;
        y = tmp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
