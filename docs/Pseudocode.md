# Design Artifact: Permutation Generation Pseudocode
**Project:** CS 2430 Project 2 - The Lions

## 1. Overview
The 'PermutationGenerator' is responsible for generating all $n!$ unique permutations of an integer array '[0, 1, ..., n-1]'. This ensures the 'ExperimentDriver' tests every possible case for $n=4, 6, 8$.

## 2. Main generic Logic
**Function: generateAll (n)**
1. **Initialize:** Create an array 'arr' of size 'n' containing values '0' through 'n-1'.
2. **Collect First Case:** Add a copy of the initial sorted 'arr' to a list of results.
3.  **Loop:** While 'hasNextPermutation(arr)' is TRUE:

   a. Find the largest index 'i' such that 'arr[i] < arr[i + 1]'.
   
   b. If no such 'i' exists, the sequence is in descending order; **Return all results**.
   
   c. Find the largest index 'j > i' such that 'arr[i] < arr[j]'.
   
   d. **Swap** 'arr[i]' and 'arr[j]'.
   
   e. **Reverse** the suffix starting at 'arr[i + 1]' through the end of the array.
   
   f. Add the new 'arr' state to the results list.

## 3. Supporting Logic (UML Methods)
**Method: swap(arr, i, j)**
- Temporarily store 'arr[i]'.
- Set 'arr[i] = arr[j]'.
- Set 'arr[j] = temp'.

**Method: reverse(arr, start, end)**
- While 'start < end':
  - 'swap(arr, start, end)'
  - 'start++', 'end--'
 
## 4. Integration with Experiment Architecture
As shown in the UML, the 'PermutationGenerator' passess these arrays to the 'ExperimentDriver'. The driver then iterates through the collection, passing each arrayinto the 'SortingAlgorithm.sort()' method to produce a 'SortResult'.
