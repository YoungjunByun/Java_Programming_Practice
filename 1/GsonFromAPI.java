package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\", \"age\":30}"; //문자열의 ""와 다름을 나타내기 위해서 \"으로 사용한 것이다. 문자열의 기호와 구분하기 위해 \"의 기호를 쓴거라고 생각하자.
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.toString());
    }
}
