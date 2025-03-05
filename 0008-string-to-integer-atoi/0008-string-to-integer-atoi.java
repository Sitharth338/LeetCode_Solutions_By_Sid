class Solution {
    public int myAtoi(String s) {

        s = s.trim();
      if(s.length()==0) return 0;

      int sign =1;
      int i=0;
      char c = s.charAt(0);
      if(c=='-'){
        sign = -1;
        i++;
      }
      else if(c=='+'){
        i++;
      }

    long sum =0;
    while(i<s.length()){
       char ch = s.charAt(i);

       if(ch<'0' || ch>'9') break;

        int num = ch-'0';
        sum = sum * 10 + num;

        if(sign ==1 && sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
         if(sign ==-1 && -sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        i++;
    }
        
        return  (int) sum*sign;
    }
}