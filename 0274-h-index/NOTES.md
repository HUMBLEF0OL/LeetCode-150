Sort the citations array in non-ascending order. Let's say the sorted array is called sortedCitations.
​
Initialize a variable called H-index to 0. This variable will store the calculated H-index value.
​
Iterate over the sortedCitations array using a for loop. For each index i (0-based index):
​
a. Calculate min(citations[i], i+1). This represents the minimum value between the number of citations at index i and i+1. The i+1 represents the number of papers that have been considered so far.
​
b. Take the maximum of the calculated value and the current value of H-index. This is because the H-index should be the highest value that satisfies the condition among all the papers considered so far.
​
After the loop finishes, the H-index variable will hold the final H-index value.