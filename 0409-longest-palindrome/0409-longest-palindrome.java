class Solution {
    public int longestPalindrome(String s) {
          Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean oddFound = false;

        for (int count : counts.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddFound = true;
            }
        }

        if (oddFound) {
            length += 1;
        }

        return length;
    }
    }
