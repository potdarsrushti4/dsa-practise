public class Trapped_rainwater{

    public static int calculateTrappedWater(int height[])
    {
        
        int n = height.length;
        //calculating left max
        int[] leftMax= new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1;  i<n ; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        
        //calulating right max
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i= n-2 ; i>=0 ; i--)
        {
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
            
        }
        
        int trappedWater  = 0;
        for (int i=0 ; i<n ; i++)
        {
            //calculate water level
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //calculate trapped water
            trappedWater += waterLevel - height[i];

        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int result = calculateTrappedWater(height);
        System.out.println(result);
    }
}