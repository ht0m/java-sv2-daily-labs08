package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public int findsSmallestTemperatureSpread(String path) {
        List<String> file = new ArrayList<>();

        try {
            file = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int minSpread = Integer.MAX_VALUE;
        int day = 0;

        try {
            for (int i = 2; i < 32; i++) {
                int dailyMax = Integer.parseInt(file.get(i).substring(6, 8).trim());
                int dailyMin = Integer.parseInt(file.get(i).substring(12, 14).trim());
                if (dailyMax - dailyMin < minSpread) {
                    minSpread = dailyMax - dailyMin;
                    day = Integer.parseInt(file.get(i).substring(2, 4).trim());
                }
            }
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException("Illegal format", ne);
        }

        return day;
    }
}
