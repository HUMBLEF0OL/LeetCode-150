class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int result[] = {0,0};
        for(Map.Entry<Integer,Integer> mapValues: map.entrySet()){
            if(result[1]<mapValues.getValue()){
                result[0] = mapValues.getKey();
                result[1] = mapValues.getValue();
            }
        }
        return result[0];
    }
}