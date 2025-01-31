class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] a = sentence.split(" ");
       
       
        for(int i=0;i<a.length;i++){
            if(a[i].startsWith(searchWord)){
               return i+1;
            }

        }
        return -1;
    }
}