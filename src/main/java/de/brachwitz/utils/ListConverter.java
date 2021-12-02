package de.brachwitz.utils;

import java.util.List;
import java.util.stream.Collectors;

public class ListConverter
{
    public static List<Integer> convertInputListToIntegerList(List<String> input)
    {
        return input.stream().map(Integer::valueOf).collect(Collectors.toList());
    }
}