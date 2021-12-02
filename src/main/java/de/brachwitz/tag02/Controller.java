package de.brachwitz.tag02;

import java.util.List;

public class Controller
{

	protected Integer computeFinalPosition(List<String> instructions)
	{
		var horizontalPosition = 0;
		var depth = 0;

		for (int i = 0; i < instructions.size(); i++)
		{
			var value = instructions.get(i).charAt(instructions.get(i).length() - 1) - '0';
			if (instructions.get(i).charAt(0) == 'f')
			{
				horizontalPosition += value;
			}
			else
				if (instructions.get(i).charAt(0) == 'd')
				{
					depth += value;
				}
				else
					if (instructions.get(i).charAt(0) == 'u')
					{
						depth -= value;
					}
		}
		return horizontalPosition * depth;
	}
}
