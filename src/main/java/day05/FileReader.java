package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {


    private List<String> readFile(Path path) {
        List<String> lines = new ArrayList<>();
        try {
            return Files.readAllLines(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private List<ValuesOfLines> getValuesFromLines(List<String> lines, DatasForSubstring dfs, int... wrongLines) {
        List<ValuesOfLines> values = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            if (isAGoodLine(i, wrongLines)) {
                int v1 = Integer.parseInt(lines.get(i).substring(dfs.getV2Bound1(), dfs.getV2Bound2()).trim());
                int v2 = Integer.parseInt(lines.get(i).substring(dfs.getV3Bound1(), dfs.getV3Bound2()).trim());
                String col1 = lines.get(i).substring(dfs.getV1Bound1(), dfs.getV1Bound2()).trim();
                values.add(new ValuesOfLines(col1, Math.abs(v1 - v2)));
            }
        }
        return values;
    }

    private boolean isAGoodLine(int numberOfLine, int... wrongLines) {
        for (int i = 0; i < wrongLines.length; i++) {
            if (numberOfLine == wrongLines[i]) {
                return false;
            }
        }
        return true;
    }

    private String getCol1FromMinimalDifferenceValuesOfLines(List<ValuesOfLines> values) {
        int minSpread = Integer.MAX_VALUE;
        ValuesOfLines result = values.get(0);
        for (ValuesOfLines actual : values) {
            if (actual.getValue() < minSpread) {
                minSpread = actual.getValue();
                result = actual;
            }
        }
        return result.getCol1();
    }

    public int findsSmallestTemperatureSpread(String path) {
        List<String> fileLines = readFile(Paths.get(path));
        DatasForSubstring dfs = new DatasForSubstring(2, 4, 6, 8, 12, 14);
        List<ValuesOfLines> values = getValuesFromLines(fileLines, dfs, 0, 1, 32);
        String smallestTemperatureSpread = getCol1FromMinimalDifferenceValuesOfLines(values);
        return Integer.parseInt(smallestTemperatureSpread);
    }

    public String findSmallestTeamDifference(String path) {
        List<String> fileLines = readFile(Paths.get(path));
        DatasForSubstring dfs = new DatasForSubstring(7, 22, 43, 45, 50, 52);
        List<ValuesOfLines> values = getValuesFromLines(fileLines, dfs, 0, 18);
        String smallestTeamDifference = getCol1FromMinimalDifferenceValuesOfLines(values);
        return smallestTeamDifference;
    }
}


