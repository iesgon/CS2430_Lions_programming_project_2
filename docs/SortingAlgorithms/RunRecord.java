package SortingAlgorithms;

/**
 * Team: Lions
 * Team members: Iesus Gonzalez, Chris Salcedo, Edgar Pena
 * CS2430 Section 501
 * Programming Project 2 - Spring 2026
 */

import java.util.Arrays;

public class RunRecord
{
    private final String algorithmName;
    private final int[] inputArray;
    private final long comparisons;

    /**
     * Constructs a RunRecord object for one experimental run.
     *
     * @param algorithmName the name of the sorting algorithm used
     * @param inputArray the original unsorted input array
     * @param comparisons the number of element-to-element comparisons performed
     */
    public RunRecord(String algorithmName, int[] inputArray, long comparisons)
    {
        this.algorithmName = algorithmName;
        this.inputArray = Arrays.copyOf(inputArray, inputArray.length);
        this.comparisons = comparisons;
    }

    /**
     * Returns the name of the sorting algorithm used in this run.
     *
     * @return the algorithm name
     */
    public String getAlgorithmName()
    {
        return algorithmName;
    }

    /**
     * Returns a copy of the original input array for this run.
     * A copy is returned to preserve encapsulation and prevent
     * outside code from modifying the stored data.
     *
     * @return a copy of the input array
     */
    public int[] getInputArray()
    {
        return Arrays.copyOf(inputArray, inputArray.length);
    }

    /**
     * Returns the number of element-to-element comparisons
     * performed during this run.
     *
     * @return the comparison count
     */
    public long getComparisons()
    {
        return comparisons;
    }

    /**
     * Returns a string representation of this experimental run.
     *
     * @return a formatted string containing the algorithm name,
     *         input array, and comparison count
     */
    @Override
    public String toString()
    {
        return "Algorithm: " + algorithmName
                + ", Input: " + Arrays.toString(inputArray)
                + ", Comparisons: " + comparisons;
    }
}