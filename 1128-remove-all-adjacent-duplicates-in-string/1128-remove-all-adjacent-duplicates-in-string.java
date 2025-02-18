class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> ans = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!ans.isEmpty() && ans.peek()==s.charAt(i)){
                ans.pop();
            }
            else{
                ans.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ans.size();i++){
            sb.append(ans.get(i));
        }
       // sb=sb.reverse();
        return String.valueOf(sb);
    }
}