class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> ans = new HashMap();
        char[] patternCh = pattern.toCharArray();
        String[] words = s.split(" ");
        
        if(patternCh.length != words.length)
            return false;
        
        for(int i = 0; i < patternCh.length; i++) {
            if(ans.containsKey(patternCh[i])) {
                if(!ans.get(patternCh[i]).equals(words[i])) {
                    return false;
                }
                continue;
            }
            if(ans.containsValue(words[i])) {
                return false;
            }
            ans.put(patternCh[i],words[i]);
        }
        return true;
    }
}