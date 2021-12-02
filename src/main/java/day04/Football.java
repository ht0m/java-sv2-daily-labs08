package day04;

import com.sun.tools.javac.Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Football {

    private String findSmallestDifference(String path) {

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
                if (file.get(i).charAt(5) != '-') {
                    int f = Integer.parseInt(file.get(i).substring(43, 46).trim());
                    int a = Integer.parseInt(file.get(i).substring(50, 54).trim());
                    if (f - a < minSpread) {
                        minSpread = f - a;
                        name = file.get(i).substring(7, 23).trim();
                    }
                }
            }
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException("Illegal format", ne);
        }
        return name;
    }

    public static void main(String[] args) {
        Football football = new Football();
        System.out.println(football.findSmallestDifference("src/main/resources/football.dat"));
    }

}
