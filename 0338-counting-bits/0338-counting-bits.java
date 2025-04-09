class Solution {
    public int[] countBits(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(Integer.bitCount(i));
        }
        // System.out.print(list);
        int arr[] = new int[list.size()];
        int index=0;
        for(int i:list) arr[index++] =i;
        return arr;
    }
}