class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int n=N%14;
        int[] prevState=cells;
        int[] currState=new int[8];
        if (n==0) n=14;
        while(n>0){
            currState=new int[8];
            currState[0]=0;
            currState[7]=0;
            for(int i=1; i<7;i++){
                currState[i] = (prevState[i - 1] == prevState[i + 1]) ? 1 : 0;
            }
            prevState=currState;
            n--;
        }
        return currState;
    }
}