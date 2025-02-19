class Solution {
    public int[] getConcatenation(int[] nums) {
        
   return func(nums); }
    static int[] func(int[]nums){
        
        int[] result = IntStream.concat(Arrays.stream(nums),Arrays.stream(nums)).toArray();
        return result;
}
}