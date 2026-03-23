# Design Artifact: Permutation Generation Pseudocode
**Project:** CS 2430 Project 2 - The Lions
**Target Class:** 'PermutationGenerator.java'

**Function: generatePermutations(n)**
1. Initialize an array 'arr' with values '\[0, 1, ..., n-1]'.
2. Create an empty list 'permutations'.
3. Add a **copy** of 'arr' to the list.
4. While 'nextPermutation(arr)' returns TRUE:
    a. Add a new **copy** of the modified 'arr' to the list.
5. Return the list to the 'ExperimentDriver'.

**Function: nextPermutation(arr)**
1. **Find Pivot:** Find the largest index 'i' such that 'arr[i] < arr[i + 1]'.
2. **Termination:** If no such index exists (array is reverse sorted), return FALSE.
3. **Find Successor:** Find the largest index 'j' such that 'arr[j] > arr[i]'.
4. **Swap:** Exchange values at 'arr[i]' and 'arr[j]'.
5. **Reverse:** Reverse the suffix of the array starting from index `i + 1` to the end.
6. Return TRUE.
