package de.brachwitz.tag01;

import java.util.List;
import java.util.stream.IntStream;

public class DepthDetector
{
    protected Integer detectDepthIncrease(List<Integer> measurements)
    {
        return IntStream.range(0, measurements.size() - 1)
                .mapToObj(m -> List.of(measurements.get(m), measurements.get(m + 1)))
                .reduce(0, (amount, measurement) -> (measurement.get(1) > measurement.get(0)) ? amount += 1 : amount, Integer::sum);
    }

    public Integer detectThreeMeasurmentIncrease(List<Integer> measurements)
    {
        return 0;
    }
}
