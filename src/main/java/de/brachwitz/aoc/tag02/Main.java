package de.brachwitz.aoc.tag02;

import de.brachwitz.aoc.utils.FileReader;
import de.brachwitz.aoc.utils.Runner;

import java.util.List;

public class Main
{
    private static final List<String> instructions = new FileReader().readFile("/tag02/input.csv");

    public static void main(String[] args)
	{
        Runner.run(new Controller(instructions));
    }
}
