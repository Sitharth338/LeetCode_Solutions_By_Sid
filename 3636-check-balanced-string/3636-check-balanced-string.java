class Solution {
    public boolean isBalanced(String num) {
      //string to Array
      int[] arr = new int[num.length()];
      for(int i=0;i<num.length();i++){
        arr[i] = Integer.parseInt(String.valueOf(num.charAt(i)));

      }


        int even =0;
        int odd =0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
              even = even + arr[i];
            }
            else{
                odd = odd + arr[i];
            }
        }
        if(even == odd){
            return true;
        }
        return false;
    }
}