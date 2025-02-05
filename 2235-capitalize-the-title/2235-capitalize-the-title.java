class Solution {
    public String capitalizeTitle(String title) {
        String a = title.toLowerCase();
        String[] arr = a.split(" ");
        StringBuilder ans = new StringBuilder();
       
        for(int i=0;i<arr.length;i++){
            String b = arr[i];
            if(b.length()>2){
             ans.append(Character.toUpperCase(b.charAt(0))).append(b.substring(1));
            }
            else{
               ans.append(b);
            }
            if(i<arr.length-1){
                ans.append(" ");
            }
               
             
             
        }
       
        return String.valueOf(ans);
    }
}