
class Solution {
    public int dayOfYear(String date) {
        int[] dayofmonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        int year = Integer.valueOf(date.substring(0,4));
        int month = Integer.valueOf(date.substring(5, 7));
        int day = Integer.valueOf(date.substring(8));

        if(leapyear(year)){
            dayofmonth[1] = 29;  //feb leap
        }
        int dayofyear=0;
        for(int i=0;i<month-1;i++){
            dayofyear = dayofyear+dayofmonth[i];
        }
        dayofyear = dayofyear + day;
        return dayofyear;
    }
    boolean leapyear(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }
        
    }
