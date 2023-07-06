public class TwoDimArrayTest {
    public static void main(String[] args) {
        //2행 4열의 정수형 배열 생성
        int[][] m = new int[2][4];
        m[0][0] = 10;
        m[0][1] = 20;
        m[0][2] = 30;
        m[0][3] = 40;

        m[1][0] = 10;
        m[1][1] = 20;
        m[1][2] = 30;
        m[1][3] = 40;

        for(int i = 0; i<m.length; i++){
            for(int j =0; j<m[0].length; j++){
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
