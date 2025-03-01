class Solution {
    public boolean check(String w,String s){
        char arr[]=s.toCharArray();
        char arr2[]=w.toCharArray();
        for(int i=0;i<arr.length;i++){
            int ind=-1;
            for(int j=0;j<arr2.length;j++){
                if(arr2[j]==arr[i]){
                    ind =j;
                    break;
                }
            }
            if(ind==-1){
                return false;
            }
            arr2[ind]='-';
        }
        return true;
    }
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate=licensePlate.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(char c: licensePlate.toCharArray()){
            if(c>='a'&&c<='z'){
                sb.append(c);
            }
        }
        String s=sb.toString();
        int min=Integer.MAX_VALUE;
        String s2="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()<min&&check(words[i],s)){
                min=words[i].length();
                s2=words[i];
            }
        }

        return s2;
    }
}