package de.brachwitz.aoc.utils;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class Runner
{
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    public static void run(PuzzleSolver puzzleSolver)
    {
        logger.info(String.format("The solution of Part 1 is: %s", puzzleSolver.solvePartOne()));
        logger.info(String.format("The solution of Part 2 is: %s", puzzleSolver.solvePartTwo()));
    }
}
