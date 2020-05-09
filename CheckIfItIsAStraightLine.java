class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        System.out.println(coordinates.length + " "+ coordinates[0].length);
       if(coordinates.length==1)return true;
        float diX = coordinates[1][0]-coordinates[0][0];
        float diY = coordinates[1][1]-coordinates[0][1];
        float dif = diY/diX;

        for(int i=1; i<coordinates.length; i++){
            float x = coordinates[i][0]-coordinates[0][0];
            float y = coordinates[i][1]-coordinates[0][1];
            float currDif= y/x;
    
            if(currDif!=dif)
            {
                return false;
            }
        }
        return true;
    }
}