package SortingAlgorithms;

/**
 * Team: Lions
 * Team members: Iesus Gonzalez, Chris Salcedo, Edgar Pena
 * CS2430 Section 501
 * Programming Project 2 - Spring 2026
 */
import java.util.Arrays;

public class ShakerSort implements SortingAlgorithm
{
    private long comparisons;

    /**
     * Returns the name of this sorting algorithm.
     *
     * @return the algorithm name
     */
    @Override
    public String getName()
    {
        return "Shaker Sort";
    }

    /**
     * Sorts a copy of the input array using shaker sort and counts
     * the number of element-to-element comparisons performed.
     *
     * @param arr the input array to sort
     * @return a SortResult containing the sorted array and comparison count
     */
    @Override
    public SortResult sort(int[] arr)
    {
        int[] copy = Arrays.copyOf(arr, arr.length);
        comparisons = 0;

        shakerSort(copy);

        return new SortResult(copy, comparisons);
    }

    /**
     * Performs shaker sort on the given array.
     * The method alternates between a left-to-right pass and a
     * right-to-left pass until no swaps are needed.
     *
     * @param arr the array to sort
     */
    private void shakerSort(int[] arr)
    {
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;

        while (swapped)
        {
            swapped = false;

            for (int i = start; i < end; i++)
            {
                comparisons++;
                if (arr[i] > arr[i + 1])
                {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped)
            {
                break;
            }

            swapped = false;
            end--;

            for (int i = end; i > start; i--)
            {
                comparisons++;
                if (arr[i - 1] > arr[i])
                {
                    swap(arr, i - 1, i);
                    swapped = true;
                }
            }

            start++;
        }
    }

    /**
     * Swaps two elements in the array.
     *
     * @param arr the array containing the elements
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
