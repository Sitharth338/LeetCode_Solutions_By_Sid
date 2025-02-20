import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
     //   long n1 = Long.valueOf(num1);
     //   long n2 = Long.valueOf(num2);
      //  long n3 = n1+n2;   its almost crt but not work in verylarge number;

      BigInteger n1 = new BigInteger(num1);
      BigInteger n2 = new BigInteger(num2);
      BigInteger n3  = n1.add(n2);

        return String.valueOf(n3);
    }
}