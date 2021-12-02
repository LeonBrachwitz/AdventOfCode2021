package de.brachwitz.tag01;

import de.brachwitz.utils.FileReader;
import de.brachwitz.utils.ListConverter;

import java.util.List;

public class Main
{
    private static List<Integer> measurements = ListConverter.convertInputListToIntegerList(new FileReader().readFile("/tag01/input.csv"));

    public static void main(String[] args)
    {
        solvePartOne();
        solvePartTwo();
    }

    private static void solvePartOne()
    {
        System.out.printf("The value increases %s times.%n", new DepthDetector().detectDepthIncrease(measurements));
    }

    private static void solvePartTwo()
    {
        System.out.printf("The three-measurement value increases %s times.%n", new DepthDetector().detectThreeMeasurmentIncrease(measurements));
    }
}
