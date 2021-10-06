class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numbers = new HashSet();
        
        for(int i = 0; i < nums1.length; i++)
            for(int j = 0; j < nums2.length; j++)
                if(nums1[i] == nums2[j]) {
                    numbers.add(nums1[i]);
                    break;
                }
        
        int[] ans = new int[numbers.size()];
        int increment = 0;
        for(int k: numbers)
            ans[increment++] = k;
        
        return ans;
    }
}