package fc.java.course2.part2;

import fc.java.model2.AverageeCalculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};

        AverageeCalculator<Integer> integerCalculator = new AverageeCalculator<>(integers);
        double integerAverage = integerCalculator.calculateAverage();
        System.out.println(integerAverage);

        AverageeCalculator<Double> doubleCalculator = new AverageeCalculator<>(doubles);
        double doubleAverage = doubleCalculator.calculateAverage();
        System.out.println(doubleAverage);

    }
}
