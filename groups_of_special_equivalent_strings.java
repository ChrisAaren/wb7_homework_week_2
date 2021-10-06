class Solution {
    public int numSpecialEquivGroups(String[] words) {
        Set<String> ans = new HashSet();
        
        for(String word: words) {
            int[] even = new int[26];
            int[] odd = new int[26];
            for(int i = 0; i < word.length(); i++)
                if(i % 2 == 0)
                    even[word.charAt(i) - 'a']++;
                else
                    odd[word.charAt(i) - 'a']++;
            ans.add(Arrays.toString(even) + Arrays.toString(odd));
        }
        return ans.size();
    }
}