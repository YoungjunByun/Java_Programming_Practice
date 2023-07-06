public class ForLoopTest {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        //알파벳 대문자와 아스키 코드 값을 출력하라
        for(char c = 'A'; c<= 'Z'; c++){
            System.out.println(c + ":" +(int)c);
        }

        for(char c = 'a'; c<= 'z'; c++){
            System.out.println(c + ":" +(int)c);
        }

        for(int i = 65; i<= 90; i++){
            System.out.println((char)i + ":" + i);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        //foreach문(향샹된 for문)
        for(int su : numbers){
            System.out.println(su);
        }

    }
}
