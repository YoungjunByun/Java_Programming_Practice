public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c);
        int a = 'A'; //아스키 코드로 'A'의 수치값이 변환되이 저장
        System.out.println("a = " + a);
        int b = 'B' + 1;
        System.out.println("b = " + (char)b);//char로 명시적 형변환(casting) 실행
        char han = '가';
        System.out.println("han = " + han);
        int hanD = '가';
        System.out.println("hanD = " + hanD); //'가'에 해당하는 유니코드 값 출력
        int hanU = '\uAC00';
        System.out.println("hanU = " + (char)hanD); //'가'에 해당하는 유니코드 값 출력
        char upper = 'A';
        char lower =(char) (upper + 32); //4byte의 정수형이 2byte의 char로 들어가야 하므로 이건 overflow가 나므로 char로 casting
        System.out.println("lower = " + lower);

        char lower1 = 'u';
        int upper1 = lower1 - 32;//int가 int로 저장되므로 형변환할 필요가 없다
        System.out.println("upper1 = " + (char)upper1);

        int data = '1'+'2' - '0';
        System.out.println("data = " + (char)data);
    }
}
