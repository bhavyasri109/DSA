class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if (n == 1) return 1;
        int maxLen = 1;
        int currLen = 1;
        int prevSign = 0;
        for (int i = 1; i < n; i++) {
            int currSign = 0;
            if (arr[i] > arr[i - 1]) currSign = 1;
            else if (arr[i] < arr[i - 1]) currSign = -1;
            if (currSign == 0) {
                currLen = 1;
            } 
            else if (currSign == -prevSign) {
                currLen++;
            } 
            else {
                currLen = 2;
            }
            prevSign = currSign;
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }
}
