class Solution {
    public int maxArea(int[] heights) {
        int low=0;
        int high=heights.length-1;
        int maxArea=0;
        while(low<high){
            int area=Math.min(heights[low],heights[high])*(high-low);
            maxArea=Math.max(area,maxArea);
            if(heights[high]<heights[low]){
                high--;
            }
            else{
                low++;
            }
        }
        return maxArea;
    }
}
