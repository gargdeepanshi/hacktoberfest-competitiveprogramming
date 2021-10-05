class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int dp[]=new int[n];
        
        int c=0;
        for(int i=0;i<n;i++)
        {
            int max=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                {
                    if(dp[j]>max)
                        max=dp[j];
                }
            }
            dp[i]=max+1;
            if(dp[i]>c)
                c=dp[i];
                
        }
        return c;
    }
}
