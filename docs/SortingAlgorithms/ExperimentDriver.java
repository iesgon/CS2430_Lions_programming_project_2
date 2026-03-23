package SortingAlgorithms;

/**
 * Team: Lions
 * Team members: Iesus Gonzalez, Chris Salcedo, Edgar Pena
 * CS2430 Section 501
 * Programming Project 2 - Spring 2026
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExperimentDriver
{
    private PermutationGenerator generator;
    private List<SortingAlgorithm> algorithms;


    public ExperimentDriver()
    {
        generator = new PermutationGenerator();
        algorithms = new ArrayList<>();

        algorithms.add(new MergeSort());
        algorithms.add(new QuickSort());
        algorithms.add(new ShakerSort());
        algorithms.add(new HeapSort());
    }

    /**
     * Runs the experiment for a given value of n.
     *
     * @param n the size of the array
     */
    public void runExperiment(int n)
    {
        List<int[]> permutations = generator.generatePermutations(n);

        System.out.println("==================================================");
        System.out.println("n = " + n);
        System.out.println("Total permutations: " + permutations.size());
        System.out.println("==================================================");

        for (SortingAlgorithm algorithm : algorithms)
        {
            List<RunRecord> records = new ArrayList<>();
            long totalComparisons = 0;

            for (int[] permutation : permutations)
            {
                int[] inputCopy = permutation.clone();
                SortResult result = algorithm.sort(inputCopy);

                RunRecord record = new RunRecord(
                        algorithm.getName(),
                        permutation,
                        result.getComparisons()
                );

                records.add(record);
                totalComparisons += result.getComparisons();
            }

            printSummary(algorithm.getName(), records, totalComparisons);
        }
    }

    /**
     * Prints summary statistics for an algorithm.
     *
     * @param algorithmName the name of the algorithm
     * @param records the list of run results
     * @param totalComparisons total comparisons across all runs
     */
    private void printSummary(String algorithmName, List<RunRecord> records, long totalComparisons)
    {
        records.sort(Comparator.comparingLong(RunRecord::getComparisons));

        double average = (double) totalComparisons / records.size();

        System.out.println();
        System.out.println("Algorithm: " + algorithmName);
        System.out.println("Average comparisons: " + average);

        System.out.println("--- Best 10 Cases ---");
        for (int i = 0; i < Math.min(10, records.size()); i++)
        {
            System.out.println(records.get(i));
        }

        System.out.println("--- Worst 10 Cases ---");
        for (int i = Math.max(0, records.size() - 10); i < records.size(); i++)
        {
            System.out.println(records.get(i));
        }

        System.out.println();
    }
}