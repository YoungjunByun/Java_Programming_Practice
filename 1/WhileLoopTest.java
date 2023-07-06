public class WhileLoopTest {
    public static void main(String[] args) {
        //배열의 원소를 while문으로 출력하기
        int i = 0;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        i = 0;
        while(i<numbers.length){
            System.out.print(numbers[i]);
            i++;
        }
    }
}
