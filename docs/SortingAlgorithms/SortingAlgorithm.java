package SortingAlgorithms;

/**
 * Team: Lions
 * Team members: Iesus Gonzalez, Chris Salcedo, Edgar Pena
 * CS2430 Section 501
 * Programming Project 2 - Spring 2026
 */

public interface SortingAlgorithm
{
    /**
     * Returns the name of the sorting algorithm.
     *
     * @return the algorithm name
     */
    String getName();

    /**
     * Sorts the given array and counts the number of comparisons.
     *
     * @param arr the input array to sort
     * @return a SortResult containing the sorted array and comparison count
     */
    SortResult sort(int[] arr);
}
