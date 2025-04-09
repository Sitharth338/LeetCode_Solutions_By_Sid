class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i] = i;
        }
        for(int j=0;j<arr.length;j++){
            int num = arr[j];
            String b = Integer.toBinaryString(num);
         //   System.out.print(b);
         int c=0;
         for(int k=0;k<b.length();k++){
            if(b.charAt(k)=='1') c++;
         }
         arr[j] = c;
        }
        return arr;
    }
}