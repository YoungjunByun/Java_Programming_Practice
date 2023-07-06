public class ArithmeticOperTest {
    //정수의 자릿수를 구하기
    public static void main(String[] args) {
        int digit = 3625;
        System.out.println(digit%10);
        System.out.println(digit/10%10);
        System.out.println(digit/100%10);
        System.out.println(digit/1000%10);

        int num = 2579;//2+5+7+9 = ?
        int sum = 0;
        for(int i = 0; i<4; i++){
            sum += (((num)/Math.pow(10, i))%10);
        }
        System.out.println("sum = " + sum);

        //짝수? 홀수?
        int numcheck = 5;
        if(numcheck%2 == 0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }
        //배수?


    }
}
