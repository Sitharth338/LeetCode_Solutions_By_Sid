class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));

            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<st.size();i++){
              sb.append(st.get(i));
        }

        return sb.toString();
    }
}