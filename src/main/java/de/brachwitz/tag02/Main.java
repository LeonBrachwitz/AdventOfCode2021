package de.brachwitz.tag02;

import de.brachwitz.tag01.DepthDetector;
import de.brachwitz.utils.FileReader;
import de.brachwitz.utils.ListConverter;

import java.util.List;

public class Main
{
	private static final List<String> instructions = new FileReader().readFile("/tag02/input.csv");

	public static void main(String[] args)
	{
		solvePartOne();
		solvePartTwo();
	}

	private static void solvePartOne()
	{
		System.out.println(String.format("Final position is: %s", new Controller().computeFinalPosition(instructions)));
	}

	private static void solvePartTwo()
	{
		System.out.println(String.format("Final position of part 2 is: %s", new Controller().computeFinalPositionPart2(instructions)));
	}
}
