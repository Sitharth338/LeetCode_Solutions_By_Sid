class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            String s = String.valueOf(i);
            if(s.length()%2!=0) continue;
            int mid = s.length()/2;
            int sum1=0;
            int sum2=0;
            for(int j=0;j<mid;j++){
                sum1+=s.charAt(j);
            }
            for(int k=mid;k<s.length();k++){
                sum2+=s.charAt(k);
            }
            if(sum1==sum2) c++;
        }
        return c;
    }
}