class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for(String word : words){
            String dup = word.toLowerCase();
            char[] arr = dup.toCharArray();
            int a=0;
            int b=0;
            int d=0;
            for(int i=0;i<arr.length;i++){
                char c = arr[i];
                if(c=='q'||c=='w'||c=='e'||c=='r'||c=='t'||c=='y'||c=='u'||c=='i'||c=='o'||c=='p'){
                    a++;
                }
                else if(c=='a'||c=='s'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'){
                    b++;
                }
                else if(c=='z'||c=='x'||c=='c'||c=='v'||c=='b'||c=='n'||c=='m'){
                    d++;
                }
            }
            int n = word.length();
            if(a==n ||b==n|| d==n){
                list.add(word);
            }
        }

        String[] res = new String[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}