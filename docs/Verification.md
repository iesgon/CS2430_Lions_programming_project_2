# Programming Project 2 – Verification Plan
**Team:** Lions
**Verification Lead:** Chris Salcedo Cardenas

## 1. Comparison Counting "Gold Standard" (n=3)
To verify the counters in 'ShakerSort.java' and 'QuickSort.java', we will use the permutation '{2, 1, 0}':

- **Shaker Sort Trace:** 
    - Pass 1 (Forward): '(2,1)' compare, '(2,0)' compare. (2 total)
    - Pass 2 (Backward): '(0,1)' compare. (1 total)
    - **Total Expected:** 3 comparisons.
- **QuickSort Trace (Lomuto Partition):**
    - Partition 1 (Pivot 0): '(2,0)' compare, '(1,0)' compare. (2 total)
    - Partition 2 (Pivot 1): '(2,1)' compare. (1 total)
    - **Total Expected:** 3 comparisons.

## 2. Experimental Integrity Checks
- **Permutation Count:** Verify 'ExperimentDriver' reports exactly 24 runs for $n=4$ and 40,320 runs for $n=8$.
- **Best/Worst 10 Logic:** Verify 'ExperimentDriver.printSummary' uses 'Comparator.comparingLong' to ensure the lists are correctly ordered by comparison count.
- **Average Calculation:** Manually verify 'totalComparisons / 24.0' matches the output for $n=4$.

## 3. Correctness Audit
The Verification Lead has audited all 'SortingAlgorithm' subclasses to ensure 'comparisons+' is triggered ONLY on element comparisons.
