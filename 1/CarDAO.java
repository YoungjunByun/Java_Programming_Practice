package fc.java.model;

public class CarDAO {
   //CRUD를 만들자
    //Create = insert(저장)
    public void carInsert(CarDTO car){
        System.out.println("car정보가 DB에 저장이 되었습니다.");
    }
    public void carSelect(){
        System.out.println("car정보가 출력이 되었습니다.");
    }
}
