class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

     ArrayList<Integer> list = new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(self(i)){
                list.add(i);
            }
        }
        return list;
    }
     static boolean self(int num){
            int temp = num;
            while(temp>0){
                  int r = temp%10;
                  temp/=10;
                  if(r==0 || num%r!=0){
                    return false;
                  }

            }
            return true;
        }
}