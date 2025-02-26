class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even =new ArrayList<>();
          ArrayList<Integer> odd =new ArrayList<>();

          for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
          }
          Collections.sort(even);
          odd.sort(Collections.reverseOrder());

          int oddpos=0;
          int evenpos=0;

          for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even.get(evenpos);
                evenpos++;
            }
            else{
                nums[i] = odd.get(oddpos);
                oddpos++;
            }
          }
      return nums;
    }
}