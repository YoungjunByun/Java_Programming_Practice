public class MemberTest {
    //member class만든 후 출력
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "Jun";
        m.age = 30;
        m.tel = "010-1111-1111";
        m.email = "fc@naver.com";
        m.addr = "Seoul";
        m.weight = 57.6f;

        System.out.println(m.name + "\t" + m.age + "\t" + m.tel + "\t" + m.email + "\t" + m.addr + "\t" + m.weight);
    }
}
