class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
            int currentWealt=0;
            for(int j=0;j<accounts[i].length;j++){
                currentWealt+=accounts[i][j];
            }
            if(currentWealt>maxWealth){
                maxWealth=currentWealt;
            }
        }
       
        return maxWealth;
    }
}