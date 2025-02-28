class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x=0;//row
        int y=0;//col
       int  len=commands.size();

        for(int i=0;i<len;i++){
            String s = commands.get(i);
            if(s.equals("UP")){
                x--;
            }
            else if(s.equals("DOWN")){
                x++;
            }
            else if(s.equals("RIGHT")){
                y++;
            }
            else if(s.equals("LEFT")){
              y--;
            }
        }
        return (x*n)+y;
    }
}