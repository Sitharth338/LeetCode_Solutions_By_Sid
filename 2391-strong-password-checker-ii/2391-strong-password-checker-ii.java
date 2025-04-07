class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }
        boolean lo = false;
        boolean up = false;
        boolean dig = false;
        boolean sp = false;


        String special = "!@#$%^&*()-_=+[]{};:'\",.<>?/\\|`~"; 
        for(int i=0;i<password.length();i++){
            char c = password.charAt(i);
          if(Character.isLowerCase(c)) lo = true;
          else if(Character.isUpperCase(c)) up = true;
          else if(Character.isDigit(c)) dig = true;
          else if(special.contains(String.valueOf(c))) sp = true;
          if (i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                return false;
            }
        }
        return lo && up && dig && sp;
    }
}