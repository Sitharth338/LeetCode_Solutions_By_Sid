class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n =heights.length;

        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[n];

         for (int i = 0; i < n; i++) {
            res[i] = map.get(heights[n - 1 - i]);  // heights are sorted so traverse from last to get the tallest person;
         }
         return res;
    }
}