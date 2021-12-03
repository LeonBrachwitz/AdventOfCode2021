package de.brachwitz.aoc.tag01;

import de.brachwitz.aoc.utils.FileReader;
import de.brachwitz.aoc.utils.ListConverter;
import de.brachwitz.aoc.utils.Runner;

import java.util.List;

public class Main
{
    private static final List<Integer> measurements = ListConverter.convertInputListToIntegerList(new FileReader().readFile("/tag01/input.csv"));

    public static void main(String[] args)
    {
        Runner.run(new DepthDetector(measurements));
    }
}
