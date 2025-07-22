class Solution {
     static int rev(int n){
            int sum =0;
            while(n>0){
                sum = sum * 10 + (n%10);
                n=n/10;
            }
            return sum;
        }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
            set.add(rev(i));
        }
        return set.size();
    }
}