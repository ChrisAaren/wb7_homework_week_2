class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> uncommon = new HashMap();
        
        for(String word: s1.split(" "))
            uncommon.put(word, uncommon.getOrDefault(word, 0) + 1);
        
        for(String word: s2.split(" "))
            uncommon.put(word, uncommon.getOrDefault(word, 0) + 1);
        
        List<String> list = new ArrayList();
        for(String word: uncommon.keySet())
            if(uncommon.get(word) == 1)
                list.add(word);
        
        String[] ans = list.toArray(new String[list.size()]);
        return ans;
    }
}