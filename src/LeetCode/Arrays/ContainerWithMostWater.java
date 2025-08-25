package LeetCode.Arrays;

public class ContainerWithMostWater {
    // greedy approach (optimal solution)
    static int maxArea2(int[] height){
        int n = height.length;
        int ans = 0;
        int i=0,j=n-1;
        while(i<j){
            int w=j-i;
            int h=Math.min(height[i],height[j]);
            ans=Math.max(ans,w*h);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }

    // brut force method (worst time complexity)
    static int maxArea(int[] height){
        int n = height.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int w = j-i;
                int h = Math.min(height[i], height[j]);
                ans=Math.max(w*h,ans);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
        System.out.println(maxArea2(arr));
    }
}
