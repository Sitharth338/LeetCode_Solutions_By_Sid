class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> S = new Stack<>();
        Stack<Character> T = new Stack<>();
        for(char c : s.toCharArray()){
            if( c=='#'){
                if(!S.isEmpty())
                S.pop();
            }else{
                S.push(c);
            }
        }
        for(char d : t.toCharArray()){
             if( d=='#'){
                if(!T.isEmpty())
                T.pop();
            }else{
                T.push(d);
            }
        }
        
        return S.equals(T);
        
    }
}