package de.brachwitz.tag02;

import de.brachwitz.tag01.DepthDetector;
import de.brachwitz.utils.FileReader;
import de.brachwitz.utils.ListConverter;

import java.util.List;

public class Main
{
	private static List<String> instructions = new FileReader().readFile("/tag02/input.csv");

	public static void main(String[] args)
	{
		solvePartOne();
		solvePartTwo();
	}

	private static void solvePartOne()
	{
		System.out.printf("%s", new Controller().computeFinalPosition(instructions));
	}

	private static void solvePartTwo()
	{
		System.out.printf("TODO", new Controller());
	}
}
