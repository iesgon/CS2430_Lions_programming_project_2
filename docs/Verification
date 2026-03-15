# Programming Project 2 – Verification Plan
**Team:** Lions
**Course:** CS 2430 Section 501
**Semester:** Spring 2026
**Verification Lead:** Chris

## 1. Experimental Goal
The objective is to verify the accuracy of the sorting performance data. We must ensure that the `PermutationGenerator` produces all required arrays and that each `SortingAlgorithm` subclass (Mergesort, Quicksort, Shaker, Heapsort) accurately captures the `SortResult.comparisons` count.

## 2. PART 1 - Permutation Verification
The 'PermutationGenerator' must produce exactly $n!$ unique permutations.

### 2.1 Baseline Test (n = 3)
For $n = 3$, the generator must produce exactly $3! = 6$ unique arrays:
- '{0, 1, 2}'
- '{0, 2, 1}'
- '{1, 0, 2}'
- '{1, 2, 0}'
- '{2, 0, 1}'
- '{2, 1, 0}'

**Verification Strategy:** 
- **Count Check:** Verify the total count is 6.
- **Uniqueness Check:** Ensure no duplicate arrays exist in the output set.

## 3. PART 2 - Comparison Count Validation
Per project requirements, we only count **element-to-element comparisons** (e.g., 'a[i] < a[j]'). We must exclude loop boundaries (e.g., 'i < n') or index checks.

### 3.1 Manual Trace: Shaker Sort (n = 3)
To verify the 'SortResult.comparisons' logic for the bidirectional bubble sort:
- **Input:** '{2, 1, 0}'
- **Forward Pass:** Compare 2 & 1 (1 count), Swap. Compare 2 & 0 (1 count), Swap.
- **Backward Pass:** Compare 0 & 1 (1 count), No Swap.
- **Expected Total:** 3 comparisons.

**Verification Task:** Run the driver for $n=3$ and ensure the 'SortResult' object for '{2, 1, 0}' reports exactly **3**.

## 4. PART 3 - Algorithm-Specific Verification
Each algorithm from the UML (Mergesort, Quicksort, ShakerSort, Heapsort) will be audited to ensure the 'comparisons' counter is placed correctly.

| Algorithm | Targeted Logic | Verification Method |
| :--- | :--- | :--- |
| **ShakerSort** | Swap comparisons | Manual trace of $n=3$. |
| **QuickSort** | Pivot comparisons | Audit `partition()` method for count placement. |
| **MergeSort** | Merge phase | Audit `merge()` method for element comparisons. |
| **HeapSort** | Heapify logic | Audit `heapify()` to ensure only element comparisons are counted. |

## 4. PART 4 - Data Aggregation (AlgorithmStats)
The 'AlgorithmStats' and 'ExperimentSummary' classes will be verified for mathematical accuracy before generating the final report tables for $n=4, 6, 8$.
- **Average:** Verify $\sum(\text{comparisons}) / n!$.
- **Best/Worst 10:** Verify the sorting of the 'SortResult' list is stable and accurate.

## 5. Verification Strategy & Tools
Verification will be performed through:
1. **Unit Testing:** Using small sets ($n=3$) to confirm 100% sorting accuracy.
2. **Manual Comparison:** Hand-counting expected comparisons for small arrays to verify the counter code.
3. **Log Auditing:** Reviewing the 'ExperimentSummary' output for $n=4$ to ensure format compliance.

## 6. Conclusion
This plan ensures that the performance data for the Lions' project is scientifically sound and complies with the project constraints. All "Best," "Worst," and "Average" data points will be derived from these verified methods.
