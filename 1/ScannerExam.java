import java.util.*;
public class ScannerExam {
    public static void main(String[] args) {
        //도서 정보 입력받은 후 출력하기
        Scanner scan = new Scanner(System.in);
        System.out.println("제목 : ");
        String title = scan.nextLine();
        System.out.println("title = " + title);

        System.out.println("가격 : ");
        int price = scan.nextInt();//price를 입력하면 뒤에 Enter가 자동적으로 빨대에 들어가서 빨대에 엔터가 남아있으므로 스트림 비워줘야함
        System.out.println("price = " + price);

        scan.nextLine();

        System.out.println("출판사 : ");
        String company = scan.nextLine();
        System.out.println("company = " + company);

        System.out.println("저자 : ");
        String author = scan.nextLine();
        System.out.println("author = " + author);

        System.out.println("Page : ");
        int page = scan.nextInt();
        System.out.println("page = " + page);

        scan.nextLine();

        System.out.println("ISBN : ");
        String isbn = scan.nextLine();
        System.out.println("isbn = " + isbn);

        scan.close();

    }
}
