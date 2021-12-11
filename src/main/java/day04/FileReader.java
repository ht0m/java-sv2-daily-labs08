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
            for (int i = 2; i < file.size() - 1; i++) {
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

    public String findSmallestTeamDifference(String path) {

        List<String> file = new ArrayList<>();

        try {
            file = Files.readAllLines(Paths.get(path));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        int minSpread = Integer.MAX_VALUE;
        String name = null;

        try {
            for (int i = 1; i < file.size() ; i++) {
                if (i != 18) {
                    int f = Integer.parseInt(file.get(i).substring(43, 45).trim());
                    int a = Integer.parseInt(file.get(i).substring(50, 52).trim());
                    if (Math.abs(f - a) < minSpread) {
                        minSpread = Math.abs(f - a);
                        name = file.get(i).substring(7, 22).trim();
                    }
                }
            }
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException("Illegal format", ne);
        }
        return name;
    }

//    public static void main(String[] args) {
//        System.out.println(new FileReader().findSmallestTeamDifference("src/main/resources/football.dat"));
//        System.out.println(new FileReader().findsSmallestTemperatureSpread("src/main/resources/weather.dat"));
//    }

}
