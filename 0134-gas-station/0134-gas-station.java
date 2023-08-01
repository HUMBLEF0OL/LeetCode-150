class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalOil = 0;
        for(int i=0;i<gas.length;i++){
            totalOil += gas[i] - cost[i];
        }
        // if the total oil amount is -ve then there is no possible solution
        if(totalOil < 0)return -1;
        
        int startIndex = 0;
        int amountAccumulated = 0;
        for(int i =0;i< gas.length;i++){
            int currentGain = gas[i] - cost[i];
            // if the currentGain + accumulated is -ve that means current startIndex isn't corret
            if(currentGain + amountAccumulated <0){
                startIndex = i+1;
                amountAccumulated = 0;
            } else amountAccumulated+=currentGain;
        }
        return startIndex;
    }
}