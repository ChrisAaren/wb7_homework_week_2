class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candyTypes = new HashSet();
        
        for(int i = 0; i < candyType.length; i++)
            candyTypes.add(candyType[i]);
        
        return Math.min(candyTypes.size(), candyType.length/2);
    }
}