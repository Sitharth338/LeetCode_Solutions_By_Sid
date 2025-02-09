class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
         int lengthy = 0;
        for(int i=arr.length-1;i>arr.length-2;i--){
            String l = arr[i];
            char[] c = l.toCharArray();
             lengthy = c.length;
           
        }
      return lengthy;
    }
}