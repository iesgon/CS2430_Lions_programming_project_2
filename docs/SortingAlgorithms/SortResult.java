package SortingAlgorithms;

/**
 * Team: Lions
 * Team members: Iesus Gonzalez, Chris Salcedo, Edgar Pena
 * CS2430 Section 501
 * Programming Project 2 - Spring 2026
 */

public class SortResult
{
    private int[] sortedArray;
    private long comparisons;

    /**
     * Constructs a SortResult object.
     *
     * @param sortedArray the sorted array
     * @param comparisons the number of comparisons performed
     */
    public SortResult(int[] sortedArray, long comparisons)
    {
        this.sortedArray = sortedArray;
        this.comparisons = comparisons;
    }

    /**
     * Returns the sorted array.
     *
     * @return the sorted array
     */
    public int[] getSortedArray()
    {
        return sortedArray;
    }

    /**
     * Returns the number of comparisons performed.
     *
     * @return the comparison count
     */
    public long getComparisons()
    {
        return comparisons;
    }
}
