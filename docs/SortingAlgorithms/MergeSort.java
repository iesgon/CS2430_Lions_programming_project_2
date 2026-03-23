package SortingAlgorithms;

/**
 * Team: Lions
 * Team members: Iesus Gonzalez, Chris Salcedo, Edgar Pena
 * CS2430 Section 501
 * Programming Project 2 - Spring 2026
 */
import java.util.Arrays;

public class MergeSort implements SortingAlgorithm
{
    private long comparisons;

    @Override
    public String getName()
    {
        return "Mergesort";
    }

    /**
     * Sorts the array using merge sort.
     *
     * @param arr the input array
     * @return the result containing sorted array and comparison count
     */
    @Override
    public SortResult sort(int[] arr)
    {
        int[] copy = Arrays.copyOf(arr, arr.length);
        comparisons = 0;

        mergeSort(copy, 0, copy.length - 1);

        return new SortResult(copy, comparisons);
    }

    /**
     * Recursively divides the array and sorts each half.
     */
    private void mergeSort(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    /**
     * Merges two sorted subarrays into one.
     * Counts element-to-element comparisons.
     */
    private void merge(int[] arr, int left, int mid, int right)
    {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftArr.length && j < rightArr.length)
        {
            comparisons++;
            if (leftArr[i] <= rightArr[j])
            {
                arr[k] = leftArr[i];
                i++;
            }
            else
            {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length)
        {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length)
        {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
