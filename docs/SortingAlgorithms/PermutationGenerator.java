package SortingAlgorithms;

/**
 * Team: Lions
 * Team members: Iesus Gonzalez, Chris Salcedo, Edgar Pena
 * CS2430 Section 501
 * Programming Project 2 - Spring 2026
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationGenerator
{
    /**
     * Generates all permutations of integers from 0 to n - 1.
     *
     * @param n the size of the array
     * @return a list of all permutations
     */
    public List<int[]> generatePermutations(int n)
    {
        List<int[]> permutations = new ArrayList<>();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = i;
        }

        permutations.add(Arrays.copyOf(arr, arr.length));

        while (nextPermutation(arr))
        {
            permutations.add(Arrays.copyOf(arr, arr.length));
        }

        return permutations;
    }

    /**
     * Generates the next lexicographic permutation.
     *
     * @param arr the current permutation
     * @return true if a next permutation exists, false otherwise
     */
    private boolean nextPermutation(int[] arr)
    {
        int i = arr.length - 2;

        while (i >= 0 && arr[i] >= arr[i + 1])
        {
            i--;
        }

        if (i < 0)
        {
            return false;
        }

        int j = arr.length - 1;
        while (arr[j] <= arr[i])
        {
            j--;
        }

        swap(arr, i, j);
        reverse(arr, i + 1, arr.length - 1);

        return true;
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr the array
     * @param i first index
     * @param j second index
     */
    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Reverses a portion of the array.
     *
     * @param arr the array
     * @param start starting index
     * @param end ending index
     */
    private void reverse(int[] arr, int start, int end)
    {
        while (start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}