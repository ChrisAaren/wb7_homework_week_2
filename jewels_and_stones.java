class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> storage = new HashMap<Character, Integer>();
        int jCount = 0;
        
        
        for(int i = 0; i < stones.length(); i++)
            if(storage.get(stones.charAt(i)) == null)
                storage.put(stones.charAt(i), 1);
            else {
                Integer count = storage.get(stones.charAt(i));
                storage.put(stones.charAt(i), ++count);
            }
        for(int j = 0; j < jewels.length(); j++)
            if(storage.containsKey(jewels.charAt(j)))
                jCount += storage.get(jewels.charAt(j));
        
    return jCount;
    }
}