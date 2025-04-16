class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c=0;
        String[] arr = text.split(" ");
        for(int i=0;i<arr.length;i++){
            String s = arr[i];
           boolean f = true;
           for(char ch : brokenLetters.toCharArray()){
            if(s.indexOf(ch)!=-1){
              f = false;
              break;
            }
           }
           if(f){
            c++;
            }
        }
         return c; 
    }
}