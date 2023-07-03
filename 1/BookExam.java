public class BookExam {
    public static void main(String[] args) {
        //한권의 책 데이터를 생성하고 인스턴스를 생성 후 정보를 입력하여 출력하기
        Book b; //같은 directory에 있으므로 따로 경로를 명시해줄 필요가 없다
        b = new Book();
        b.title = "java";
        b.price = 30000;
        b.company = "FastCampus";
        b.author = "Jun";
        b.page = 700;
        b.isbn = "119910";

        System.out.println(b.title + "\t" + b.price + "\t" + b.author + "\t" + b.price + "\t" + b.isbn);

    }
}
