class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int pos=0;
        for(int i=0;i<nums1.length;i++){
            arr[pos] = nums1[i];
            pos++;
        }
        for(int i=0;i<nums2.length;i++){
            arr[pos] = nums2[i];
            pos++;
        }

      Arrays.sort(arr);
      int n = arr.length;
        if (n % 2 == 1) {
           
            return arr[n / 2];
        }
          
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        
 
    

 
      
       
    }
}