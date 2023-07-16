package fc.java.model2;

public class MSSQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, psssword 정보를 이용하여 mssql DB을 접속 시도한다.");
    }
}
