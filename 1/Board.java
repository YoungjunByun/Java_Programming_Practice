package fc.java.poly;

public class Board {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //Override(재정의)
    public String toString(){
        System.out.println(super.toString()); //상위 클래스의 메서드 호출
        return title;
    }
}
