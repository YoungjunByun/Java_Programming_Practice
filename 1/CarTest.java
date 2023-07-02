public class CarTest {
    public static void main(String[] args){
        String model = "BMW528i";
        System.out.println("model = " + model);
        long distance = 10000000000000L;//L을 적지 않으면 프로세서는 기본적으로 int(4byte)로 인식하므로 overflow가 나므로 long(8byte)으로 인식시키기 위해 반드시 뒤에 L을 붙여준다
        System.out.println("distance = " + distance + "km");
        int price = 9000000;
        System.out.println("price + = " + price + "won");
        String company = "BMW";
        System.out.println("company = " + company);
        char type = 'A';
        System.out.println("type = " +type + "Type");
        boolean auto = true;
        System.out.println("auto = " + auto);
        int year = 2000;
        System.out.println("year = " + year);
        float gasmi = 12.5f;//f를 적지 않으면 프로세서는 실수 데이터는 기본적으로 double(8byte)로 인식하므로 float(4byte)로는 overflow가 나서 들어갈 수 없으므로 뒤에 f를 붙인다.
        System.out.println("gasmi = " + gasmi);
    }
}
