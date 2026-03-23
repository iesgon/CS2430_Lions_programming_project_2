package SortingAlgorithms;

/**
 * Team: Lions
 * Team members: Iesus Gonzalez, Chris Salcedo, Edgar Pena
 * CS2430 Section 501
 * Programming Project 2 - Spring 2026
 */
import java.util.Arrays;

public class QuickSort implements SortingAlgorithm
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
        return "Quicksort";
    }

    /**
     * Sorts a copy of the input array using quicksort and counts
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

        quickSort(copy, 0, copy.length - 1);

        return new SortResult(copy, comparisons);
    }

    /**
     * Recursively sorts the portion of the array between the given
     * low and high indices.
     *
     * @param arr the array being sorted
     * @param low the starting index of the current subarray
     * @param high the ending index of the current subarray
     */
    private void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions the array around a pivot value so that all elements
     * smaller than the pivot appear before it, and all larger or equal
     * elements appear after it.
     *
     * @param arr the array being partitioned
     * @param low the starting index of the subarray
     * @param high the ending index of the subarray
     * @return the final index of the pivot
     */
    private int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++)
        {
            comparisons++;
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
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