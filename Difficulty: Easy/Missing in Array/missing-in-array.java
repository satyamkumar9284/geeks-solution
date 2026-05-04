class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        long asum=0;
        long esum=(long)n*(n+1)/2;
        
        for(int i=0;i<arr.length;i++){
            asum+=arr[i];
        }
        return (int)(esum-asum);
    }
}

