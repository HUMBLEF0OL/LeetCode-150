class RandomizedSet {
    private HashSet<Integer> numberSet;
    public RandomizedSet() {
        numberSet = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(numberSet.contains(val)) return false;
        numberSet.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(numberSet.contains(val)){
            numberSet.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        List<Integer> temp = new ArrayList<>(numberSet);
        int size = temp.size()-1;
        int randomIndex = (int)(Math.random()*(size+1));
        return temp.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */