package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    List<Integer> numbers = Arrays.asList(4, 8, 12, 20);


    @Test
    void testNumberSequenceCreate() {
        NumberSequence numberSequence = new NumberSequence(numbers);
        assertEquals(4, numberSequence.numbers.size());
        assertEquals(20, numberSequence.numbers.get(3));
    }

    @Test
    void testCloseToAverage() {
        NumberSequence numberSequence = new NumberSequence(numbers);
        assertEquals(Arrays.asList(8, 12), numberSequence.closeToAverage(5));

    }

}