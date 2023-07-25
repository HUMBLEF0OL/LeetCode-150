Use two-pointer technique
- maintain 2 pointers=> i for correct index(it will be returned in the end). j for looping over the complete length of the given array. Apart from that also maintain frequency counter
- if we encounter a different value then push that value in i and reset the frequency to 1
- else if first check whether the frequency is less then 2
- if yes then push it into ith index and increase the frequency
- otherwise just continue to next index