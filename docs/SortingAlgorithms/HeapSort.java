package SortingAlgorithms;

/**
 * Team: Lions
 * Team members: Iesus Gonzalez, Chris Salcedo, Edgar Pena
 * CS2430 Section 501
 * Programming Project 2 - Spring 2026
 */
import java.util.Arrays;

public class HeapSort implements SortingAlgorithm
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
        return "Heapsort";
    }

    /**
     * Sorts a copy of the input array using heapsort and counts
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

        heapSort(copy);

        return new SortResult(copy, comparisons);
    }

    /**
     * Performs heapsort on the given array by first building a max heap
     * and then repeatedly moving the largest element to the end.
     *
     * @param arr the array to sort
     */
    private void heapSort(int[] arr)
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
        {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--)
        {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    /**
     * Ensures that the subtree rooted at index i satisfies the max-heap property.
     * If one of the children is larger than the root, the root is swapped with
     * the largest child and heapify is applied recursively.
     *
     * @param arr the heap stored in array form
     * @param n the current size of the heap
     * @param i the index of the subtree root
     */
    private void heapify(int[] arr, int n, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n)
        {
            comparisons++;
            if (arr[left] > arr[largest])
            {
                largest = left;
            }
        }

        if (right < n)
        {
            comparisons++;
            if (arr[right] > arr[largest])
            {
                largest = right;
            }
        }

        if (largest != i)
        {
            swap(arr, i, largest);
            heapify(arr, n, largest);
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
