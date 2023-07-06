public class ArrayExam {
    public static void main(String[] args) {
        //대문자 APPLE을 소문자 apple로 출력
        char[] c = {'A', 'P', 'P', 'L', 'E'};
        for(int i =0; i < c.length; i++){
            c[i] = (char)(c[i] + 32);
            System.out.print(c[i]);
        }
    }
}
