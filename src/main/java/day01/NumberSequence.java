package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {
    List<Integer> numbers = new ArrayList<>();

    public NumberSequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public NumberSequence(int count, int minValue, int maxValue) { //
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(minValue, maxValue + 1));
        }
    }

    public List<Integer> closeToAverage(int value) {
        List<Integer> resultList = new ArrayList<>();
        double avg = calculateAvg();

        for (int act : numbers) {
            if (Math.abs(act - avg ) <= value) {
                resultList.add(act);
            }
        }
        return resultList;
    }

    private double calculateAvg(){
        double sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum/numbers.size();
    }

}
