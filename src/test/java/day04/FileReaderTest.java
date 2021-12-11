package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void test() {
        FileReader fileReader = new FileReader();
        assertEquals(14, fileReader.findsSmallestTemperatureSpread("src/main/resources/weather.dat"));
        assertEquals("Aston_Villa", fileReader.findSmallestTeamDifference("src/main/resources/football.dat"));
    }

}