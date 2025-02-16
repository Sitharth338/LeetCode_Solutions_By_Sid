class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> banned_words = new HashSet();
        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String banWord : banned){
            banned_words.add(banWord);
        }

        String[] words = paragraph.toLowerCase().split("\\W+");

        for(String word : words){
            if(!banned_words.contains(word)){
                wordCount.put(word, wordCount.getOrDefault(word, 0)+ 1);
            }
        }

        int max = 0;
        String result = "";

        for(String word : wordCount.keySet()){
            if(wordCount.get(word) > max){
                max = wordCount.get(word);
                result = word;
            }
        }
        return result;
    }
}