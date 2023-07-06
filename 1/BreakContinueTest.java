public class BreakContinueTest {
    public static void main(String[] args) {
        //char 배열 중 'o'문자를 만나면 반복 중지하도록 코드 작성
        char[] c = {'s', 'h', 'u', 't', 'd', 'o', 'w', 'n'};
        for(int i = 0; i < c.length; i++){
            if(c[i] == 'o') break;
            System.out.print(c[i]);
        }
        System.out.println();
        //1~10까지의 수 중 3의 배수의 개수를 구하여 출력하시오
        int count = 0;
        for(int i = 1; i <= 10; i++){
            if(i%3 != 0) continue;
            count++;
        }
        System.out.println("count = " + count);
    }
}
