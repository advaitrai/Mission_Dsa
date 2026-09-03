class Solution {
    public int pivotIndex(int[] nums) {
        int lm=0;
        int rm=0;
        int tl=0;
        for (int i = 0; i < nums.length; i++) {
            tl =tl+ nums[i];
        }
       for(int j=0;j<nums.length;j++){
         
        rm=tl-lm-nums[j];
        if(lm==rm){
            return j;
        }
        lm=lm+nums[j];
       } 
       return -1;
    }
}