package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        // Upcasting으로 객체를 생성

        Animal ani = new Dog();
        ani.eat();//Runtime에 사용될(호출될)메서드가 결정되는 바인딩 = 동적바인딩

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night();
    }
}
