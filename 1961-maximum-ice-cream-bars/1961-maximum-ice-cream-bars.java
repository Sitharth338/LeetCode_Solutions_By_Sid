class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int sum=0;
        for(int i=0;i<costs.length;i++){
            sum+=costs[i];
            if(sum<=coins){
                count++;
            }else{
                break;
            }
        }
   return count;
    }
}