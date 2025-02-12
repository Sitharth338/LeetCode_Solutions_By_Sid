class Solution {
    public int alternateDigitSum(int n) {
        String num = String.valueOf(n);
        int sum=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){ 
                sum = sum+Integer.valueOf(num.charAt(i)-'0');
            }
            else if(i%2!=0){
                sum = sum-Integer.valueOf(num.charAt(i)-'0');
            }
        }

        return sum;
    }
}