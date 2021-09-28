class Solution {
    public boolean isHappy(int n) {
        Set<Integer>  happyNumber = new HashSet<Integer>();
        while (n != 1 && !happyNumber.contains(n)) {
            happyNumber.add(n);
            n = splitMultiply(n);
        }
        return n == 1;
    }
    
    public int splitMultiply(int n) { 
        int sum = 0; 
        while (n > 0) {
            int num = n % 10;
            n = n / 10;
            sum += num * num;
        }
        return sum;
    }
}