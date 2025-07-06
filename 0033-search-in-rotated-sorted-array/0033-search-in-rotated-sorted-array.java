class Solution {
    public int search(int[] arr, int target) {
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            if(arr[l]==target) return l;
            if(arr[r]==target) return r;
            l++;
            r--;
        }
        return -1;

    }
}