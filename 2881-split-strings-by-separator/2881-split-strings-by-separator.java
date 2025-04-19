class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        

        List<String> ans = new ArrayList<>();
        for(String str :words){
            for(String part : str.split("\\"+ separator)){
                if(!part.isEmpty()){
                    ans.add(part);
                }
            }
        }
        return ans;
    }
}