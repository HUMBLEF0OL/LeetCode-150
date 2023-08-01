class Solution {
    public int candy(int[] ratings) {
        int left [] = new int[ratings.length];
        Arrays.fill(left,1);
        // first pass from left -> right (if the rating of current > last then increment candy by 1)
        for(int i =1;i<ratings.length;i++){
            if(ratings[i] > ratings[i-1]) left[i] = left[i-1]+1;
        }
        
        // second pass from right -> left (if the rating of current > next then increment candy by right*which is extra amount)
        int right = 1;
        for(int i = ratings.length-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                right++;
                left[i] = Math.max(right,left[i]);
            } else right = 1;
        }
        // in the end find the overall sum
        int result = 0;
        for(int i =0;i<ratings.length;i++){
            result += left[i];
        }
        return result;
        
    }
}