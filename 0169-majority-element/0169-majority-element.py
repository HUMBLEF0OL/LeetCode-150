class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        mapDictionary = defaultdict(int)
        result = [0,0]
        for i in nums:
            mapDictionary[i] +=1
            if mapDictionary[i] > result[1]:
                result[0] =i
                result[1] = mapDictionary[i]
        return result[0]