class Solution {
    public int findSpecialInteger(int[] arr) {
        int size = arr.length;
        int qtr = size/4;
        int c=1;
        int a = arr[0];
        for(int i=1;i<size;i++){
            if(a==arr[i]) c++;
            else c=1;
            if(c>qtr) return arr[i];
            a = arr[i];
        }
        return a;
    }
}