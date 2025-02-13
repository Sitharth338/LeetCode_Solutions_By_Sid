class Solution {
    public boolean isValid(String word) {
       if(word.length()<3){
        return false;
       }

    int vowel=0;
    int consonent=0;
    for(int i=0;i<word.length();i++){
    char c = word.charAt(i);

     if(c>='a' && c<='z' ||c>='A' && c<='Z'){

        if(c=='a' || c=='e' || c=='i' ||c=='o'||c=='u' ||c=='A' || c=='E'||c=='I'||c=='O'||c=='U')
        {
           vowel++;
        }
       else{
          consonent++;
        }

       }
       else if(c>='0' &&c<='9')
       {
        continue;
       }
       else{
        
        return false;
       
        }


       }

       if(vowel>0 && consonent>0){
        return true;
       }
       return false;
    }
}