class mostWater{
    class Solution{
        public int maxArea(int[] height){
            int max_area=0;
            int start=0;
            int end=height.length-1;
            while(start<end){
                if(height[start]<height[end]){
                    max_area=Math.max(max_area, height[start]*end-start);
                    start++;
                }
                else{
                    max_area=math.max(max_area,height[end]*end-start);
                    end--;
                }

            }
            return max_area;
        }
    }
    public static void main(String[] args ){

    }
}