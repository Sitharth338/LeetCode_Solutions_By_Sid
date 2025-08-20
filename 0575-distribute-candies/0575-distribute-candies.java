class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int num : candyType){
            set.add(num);
            if(set.size()== candyType.length/2) break;
        }
        return set.size();
     }
}