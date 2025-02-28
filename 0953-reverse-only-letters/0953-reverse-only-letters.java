class Solution {
    public String reverseOnlyLetters(String s) {
       char[] ch = s.toCharArray();
        int fp=0;
        int bp=s.length()-1;

        while(fp<bp){
            if(Character.isAlphabetic(ch[fp]) && Character.isAlphabetic(ch[bp])){
                char temp = ch[fp];
                ch[fp] = ch[bp];
                ch[bp] =temp;

                fp++;
                bp--;

            }
            else if(!Character.isAlphabetic(ch[fp])) fp++;
            else if(!Character.isAlphabetic(ch[bp])) bp--;
        }

        return String.valueOf(ch);
    }
}