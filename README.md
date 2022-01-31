# sortAlgorithms

### 5 Most used Sorting Algorithms in Java


1. Merge Sort
2. Heap Sort
3. Insertion Sort
4. Selection Sort
5. Bubble Sort

| Algorithm | Approach | Best Time Complexity |
|---|---|---|
| Merge Sort | Split the array into smaller subarrays till  pairs of elements are achieved, and then  combine them in such a way that they are in order. | O(n log (n)) |
| Heap Sort | Build a max (or min) heap and extract  the first element of the heap (or root), and then send it to the end of the heap.  Decrement the size of the heap and repeat  till the heap has only one node. | O(n log (n)) |
| Insertion Sort | In every run, compare it with the predecessor.  If the current element is not in the correct location,  keep shifting the predecessor subarray till  the correct index for the element is found. | O (n) |
| Selection Sort | Find the minimum element in each run of the array  and swap it with the element at the current index is compared. | O(n^2) |
| Bubble Sort | Keep swapping elements that are not in their right  location till the array is sorted. | O (n) |