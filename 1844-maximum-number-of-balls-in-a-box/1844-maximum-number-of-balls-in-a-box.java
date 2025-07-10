class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> box = new HashMap<>();
        int max =0;
        for(int i= lowLimit ; i<= highLimit;i++){
            int sum=0;
            int num = i;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            box.put(sum,box.getOrDefault(sum,0)+1);
            max = Math.max(max , box.get(sum));
        }
        return max;
    }
}