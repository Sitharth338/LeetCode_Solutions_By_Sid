class Solution {
    public String replaceWords(List<String> list, String sentence) {
        String[] arr = sentence.split(" ");
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<list.size();j++){
            if(arr[i].startsWith(list.get(j))){
                arr[i] = list.get(j);
               // break;
            }
           }

        }String ans = "";
        for(int i=0;i<arr.length;i++){
            ans+=arr[i]+" ";
        }
        return ans.trim();

        
    }
}