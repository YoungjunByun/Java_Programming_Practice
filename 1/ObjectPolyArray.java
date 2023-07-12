package fc.java.part4;

import fc.java.poly.*;

public class ObjectPolyArray {
    public static void main(String[] args) {
        //A, B 클래스를 저장할 배열을 생성하시오.
        Object[] obj = new Object[2];
        obj[0] = new A(); //Upcating
        //((A)obj[0]).printGo();
        obj[1] = new B(); //Upcating
        //((B)obj[1]).printGo();
        /*
        for(int i = 0; i < obj.length; i++){
            if(obj[i] instanceof A){
                ((A)obj[0]).printGo();
            }else{
                ((B)obj[1]).printGo();
            }
        }
        */
        display(obj);
    }

    private static void display(Object[] obj) {
        for(int i = 0; i < obj.length; i++){
            if(obj[i] instanceof A){
                ((A)obj[0]).printGo();
            }else{
                ((B)obj[1]).printGo();
            }
        }
    }
}
