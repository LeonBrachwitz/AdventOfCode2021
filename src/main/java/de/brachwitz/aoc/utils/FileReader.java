package de.brachwitz.aoc.utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FileReader {
    public List<String> readFile(String filename)
    {
        try
        {
            return Files.lines(Paths.get(Objects.requireNonNull(getClass().getResource(filename)).toURI())).collect(Collectors.toList());
        } catch (Exception e)
        {
            throw new RuntimeException(String.format("Die Ressource %s konnte nicht gefunden werden!", filename));
        }
    }
}