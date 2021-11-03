## Challenge 26

### Selection Sort
Selection Sort is a sorting algorithm that traverses the array multiple times as
it slowly builds out the sorting sequence. The traversal keeps track of the
minimum value and places it in the front of the array which should be
incrementally sorted.

### Trace

<img src="./insertionSort.jpg">

### Efficency
* Time: O(n^2) The basic operation of this algorithm is comparison. This will happen n * (n-1) number of times…concluding the algorithm to be n squared.
* Space: O(1) No additional space is being created. This array is being sorted in place…keeping the space at constant O(1).

## Challenge 27

Merge sort is a “divide and conquer” algorithm wherein we first divide the problem into subproblems. When the solutions for the subproblems are ready, we combine them together to get the final solution to the problem.

### Trace 
* pass 1: divide the original array into 2 arrays (left and right).
* pass 2: divide left array also to left and right, until the size becomes 1, and the same for the right array.
*pass3: the merge processes come into action and start merging arrays back while sorting.

<img src="./challenge27.png">
<img src="./mergeSort2.png">

#### *Note in the Algorithm a very small adjustment for the first step "The base condition checks if the array length is greater than 1", not is equal to 1.

### Efficency
* Time: O(n log n)
* Space: O(n)

## Challenge 28

Quicksort is a sorting algorithm, which is leveraging the divide-and-conquer principle.The input list is divided into two sub-lists by an element called pivot; one sub-list with elements less than the pivot and another one with elements greater than the pivot. This process repeats for each sub-list.

### Traces


<img src="./Limnu_20211102.png">

### Visiual:

<img src="./quickSort.jpg">



### Efficency
* Time: O(nLog(n))
* Space: O(1)