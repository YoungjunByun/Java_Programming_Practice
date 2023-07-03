//Book class 만들고 실행
public class BookTest {
    public static void main(String[] args) {
        //6개의 변수로 한권의 책 데이터 저장 후 출력
        String title = "java";
        int price = 30000;
        String company = "FastCampus";
        String author = "Jun";
        int page = 700;
        String isbn = "1119910";
        System.out.println(title + "\t" + price + "\t" + company + "\t" + author + "\t" + page + "\t" + isbn);

        Book b;
    }
}
