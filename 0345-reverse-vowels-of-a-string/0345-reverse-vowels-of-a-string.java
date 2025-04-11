class Solution {
    public String reverseVowels(String s) {
        char[] words = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int st = 0;
        int end = s.length()-1;
        while(st<end){

            if(vowels.indexOf(words[st])==-1) st++;
            else if(vowels.indexOf(words[end])==-1) end--;
            else{
                char temp = words[st];
                words[st++] = words[end];
                words[end--] = temp;
            }
        }
        return new String(words);
    }
}