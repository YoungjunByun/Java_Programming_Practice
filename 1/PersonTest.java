package fc.java.part3;
//같은 디렉토리면 패키지를 굳이 import 안해도 된다.
public class PersonTest {
    public static void main(String[] args) {
        //한사람의 데이터를 저장할 변수를 선언하라
        Person p = new Person();
        p.name = "Jun";
        p.age = 30;
        p.phone = "010-2324-3133";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);

        p.play();
        p.eat();
        p.walk();
    }
}

