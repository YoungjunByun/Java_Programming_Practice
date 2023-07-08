package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        int carSn = 1110;
        String carName = "BMW";
        int carPrice = 3131312;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G";

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }
    //매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의하세요.
}
