# Programming Project 2 – Verification Plan
**Team:** Lions
**Verification Lead:** Chris Salcedo Cardenas

## 1. Metric Accuracy Audit (Finalized)
I have audited all four implementations to verify comparison counting:
- **Heapsort:** Validated that `comparisons++` only occurs inside `heapify` during element checks.
- **Quicksort:** Confirmed the Lomuto partition counts only `arr[j] < pivot`.
- **Mergesort:** Verified the merge loop captures all element-to-element comparisons.
- **Shaker Sort:** Confirmed both forward and backward passes increment the counter correctly.

## 2. Experimental Checks
- **n=3 Baseline:** Verified that `PermutationGenerator` produces exactly 6 arrays.
- **Data Immutability:** Verified that `RunRecord` uses `Arrays.copyOf` so the report displays the original unsorted input.
- **Average Calculation:** Confirmed that `totalComparisons / n!` is performed using double-precision math in `ExperimentDriver`.

## 3. Results Verification
The "Best 10" and "Worst 10" cases for $n=8$ will be manually inspected to ensure they follow theoretical expectations (e.g., sorted arrays being "Best" for Shaker Sort).
