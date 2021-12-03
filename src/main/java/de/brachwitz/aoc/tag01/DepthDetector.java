package de.brachwitz.aoc.tag01;

import de.brachwitz.aoc.utils.PuzzleSolver;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.IntStream;

@AllArgsConstructor
public class DepthDetector implements PuzzleSolver
{
    private final List<Integer> measurements;

    @Override
    public String solvePartOne()
	{
        return IntStream.range(0, measurements.size() - 1)
                .mapToObj(m -> List.of(measurements.get(m), measurements.get(m + 1)))
                .reduce(0, (amount, measurement) -> (measurement.get(1) > measurement.get(0)) ? amount += 1 : amount,
                        Integer::sum).toString();
    }

    @Override
    public String solvePartTwo()
	{
        var counter = 0;
        for (int i = 0; i < measurements.size(); i++)
		{
            if (i < measurements.size() - 3) {
                var previousThree = measurements.get(i) + measurements.get(i + 1) + measurements.get(i + 2);
                var nextThree = measurements.get(i + 1) + measurements.get(i + 2) + measurements.get(i + 3);

                if (previousThree < nextThree)
				{
                    counter++;
                }
            }
        }
        return String.valueOf(counter);
    }
}
