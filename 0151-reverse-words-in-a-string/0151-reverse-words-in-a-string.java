class Solution {
    public String reverseWords(String s) {
        StringBuilder a = new StringBuilder();

        String[] arr = s.trim().split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            a.append(arr[i]);
            if(i>0)
            a.append(" ");
            

        }
        return String.valueOf(a);
    }
}