public class LoopLoopTest {
    public static void main(String[] args) {
        int index = 1;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(index);
                index++;
            }
        }

        System.out.println();
        int[][] a = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}
        };
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        //2단~9단을 출력하는 프로그램 작성
        for(int i = 2; i<10; i++){
            System.out.print(i + "단\t\t");
        }
        System.out.println();

        for(int i = 1; i <= 9; i++){
            for(int j = 2; j <= 9; j++){
                System.out.print(j + "x" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
