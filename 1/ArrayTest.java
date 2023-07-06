public class ArrayTest {
    public static void main(String[] args) {
        //실수 5개를 저장할 배열을 생성하고 모든 원소에 10을 저장하고 출력
        float[] f = new float[5];
        for(int i = 0; i < f.length; i++){
            f[i] = 10.0f;
            System.out.println(f[i]);
        }
        //정수 5개를 배열에 초기화하고 0번째와 3번째를 더하라
        int[] a = {10, 20, 30, 40, 50};
        int sum = a[0] + a[3];
        System.out.println("sum = " + sum);
        System.out.println(a. length);

        float[] b = new float[3];//배열의 요소들은 기본값이 0으로 세팅되어 있다
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        int[] c;
        c = new int[]{10, 20, 30, 40, 50};
    }
}
