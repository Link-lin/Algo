public class WithMostWater{

    public static int maxAreaBrute(int[] height) {
        int max = 0;
        int area = 0;
        for(int i =0; i < height.length; i++){
            for(int j = i+1; j < height.length; j++){
                area = (j-i)*Math.min(height[j], height[i]); 
                if(area > max) max = area;
            }
        }
        return max;
    }

    public static int maxArea(int[] height){
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l < r){
            int temp = Math.min(height[l], height[r])* (r-l);
            if(temp > max) max = temp;
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        maxAreaBrute(arr);
    }
}