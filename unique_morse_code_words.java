class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> morse = new HashSet();
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String wd: words) {
            StringBuilder translation = new StringBuilder();
            for(char ch: wd.toCharArray()) 
                translation.append(code[ch-'a']);
            morse.add(translation.toString());
        }
        return morse.size();
    }
}