class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);  // Sort the array in ascending order
        int n = citations.length;
        int hIndex = 0;

        for (int i = 0; i < n; i++) {
            // Calculate the minimum value between the number of citations at index i and (n - i)
            int h = Math.min(citations[i], n - i);
            hIndex = Math.max(hIndex, h);
        }

        return hIndex;
    }
}