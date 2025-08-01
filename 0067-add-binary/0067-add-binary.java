// class Solution {
//     public String addBinary(String a, String b) {
//         int x = Integer.parseInt(a,2);
//         int y = Integer.parseInt(b,2);
//         int z = x+y;
//         return Integer.toBinaryString(z);
//     }
// }
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);  // binary digit
            carry = sum / 2;         // carry for next digit
        }

        return result.reverse().toString();
    }
}