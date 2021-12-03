package de.brachwitz.aoc.tag02;

import de.brachwitz.aoc.utils.PuzzleSolver;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Controller implements PuzzleSolver
{
    private final List<String> instructions;

    @Override
    public String solvePartOne()
	{
        var horizontalPosition = 0;
        var depth = 0;

        for (String instruction : instructions)
		{
            var value = instruction.charAt(instruction.length() - 1) - '0';
            var firstChar = instruction.charAt(0);
            if (firstChar == 'f') {
                horizontalPosition += value;
            } else if (firstChar == 'd')
			{
                depth += value;
            } else if (firstChar == 'u')
			{
                depth -= value;
            }
        }
        return String.valueOf(horizontalPosition * depth);
    }

    @Override
    public String solvePartTwo()
	{
        var horizontalPosition = 0;
        var depth = 0;
        var aim = 0;

        for (String instruction : instructions)
		{
            var value = instruction.charAt(instruction.length() - 1) - '0';
            var firstChar = instruction.charAt(0);
            if (firstChar == 'f')
			{
                horizontalPosition += value;
                depth += value * aim;
            } else if (firstChar == 'd')
			{
                aim += value;
            } else if (firstChar == 'u')
			{
                aim -= value;
            }
        }
        return String.valueOf(horizontalPosition * depth);
    }
}
