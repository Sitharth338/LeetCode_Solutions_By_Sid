
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        var trie = new Trie();
        for (String w : banned)
            trie.add(0, w, true);
        
        var idx = 0;
        while (idx < paragraph.length())
            idx = trie.add(idx, paragraph, false);

        if (trie.rootMaxCount == null)
            return null;
        
        return paragraph.substring(trie.rootMaxCount.wordStartIdx, trie.rootMaxCount.wordEndIdx + 1).toLowerCase();
    }
    
    static final class Trie {
        Trie rootMaxCount;

        boolean terminal;
        boolean banned;
        int count;
        int wordStartIdx;
        int wordEndIdx;
        Trie[] children;
        
        int add(int start, String text, boolean ban) {
            if (!Character.isAlphabetic(text.charAt(start)))
                return start + 1;

            var idx = start;
            var current = this;
            while (idx < text.length() && Character.isAlphabetic(text.charAt(idx))) {
                var lc = Character.toLowerCase(text.charAt(idx++)) - 'a';
                if (current.children == null)
                    current.children = new Trie[26];
                
                var next = current.children[lc];
                if (next == null) {
                    current.children[lc] = new Trie();
                    next = current.children[lc];
                }
                current = next;
            }

            current.terminal = true;
            current.banned = current.banned || ban;
            current.count++;
            current.wordStartIdx = start;
            current.wordEndIdx = idx - 1;

            if (!current.banned && (rootMaxCount == null || rootMaxCount.count < current.count))
                rootMaxCount = current;
            
            return idx;
        }
    }
}