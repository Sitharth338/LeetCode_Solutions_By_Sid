class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        String[] ans = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int num = Integer.parseInt(arr[i]);
            ans[i] = Integer.toBinaryString(num);
        }
        String result = String.join("-",ans);
        return result;
    }
}