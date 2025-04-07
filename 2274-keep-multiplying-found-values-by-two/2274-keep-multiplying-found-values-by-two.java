class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }

        while(true){
            if(!list.contains(original)){
                break;
            }
            original = 2 * original;
        }

        return original;
    }
}