package fc.java.model2;

public class MySQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, psssword 정보를 이용하여 mysql DB을 접속 시도한다.");
    }
}
