package de.brachwitz.tag02;

import java.util.List;

public class Controller
{

	protected Integer computeFinalPositionPart2(List<String> instructions)
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
			}
			else
				if (firstChar == 'd')
				{
					aim += value;
				}
				else
					if (firstChar == 'u')
					{
						aim -= value;
					}
		}
		return horizontalPosition * depth;
	}

	protected Integer computeFinalPosition(final List<String> instructions)
	{
		var horizontalPosition = 0;
		var depth = 0;

		for (String instruction : instructions)
		{
			var value = instruction.charAt(instruction.length() - 1) - '0';
			var firstChar = instruction.charAt(0);
			if (firstChar == 'f')
			{
				horizontalPosition += value;
			}
			else
				if (firstChar == 'd')
				{
					depth += value;
				}
				else
					if (firstChar == 'u')
					{
						depth -= value;
					}
		}
		return horizontalPosition * depth;
	}
}
