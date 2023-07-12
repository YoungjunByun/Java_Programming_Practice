package fc.java.poly;

public class Dog extends Animal {
    //재정의를 반드시 해야한다 -> 다형성이 보장됨
    public void eat(){
        System.out.println("개처럼 먹다");
    }
}
