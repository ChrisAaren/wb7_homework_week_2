class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> isomorphic = new HashMap();
        
        for(int i = 0; i < s.length(); i++) {
            if(isomorphic.containsKey(s.charAt(i))) {
                if(isomorphic.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
                continue;
            }
            if(isomorphic.containsValue(t.charAt(i))) {
                    return false;
                }
            isomorphic.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}

