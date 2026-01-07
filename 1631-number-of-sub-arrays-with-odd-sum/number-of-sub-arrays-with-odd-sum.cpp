class Solution {
public:
    int numOfSubarrays(vector<int>& arr) {
        int ec=1;
        int oc=0;
        int result=0;
        int MOD=1e9+7;
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr[i];
            if(sum%2==0){
                result=(result+oc)%MOD;
                ec++;
            }
            else{
                result=(result+ec)%MOD;
                oc++;
            }
        }
        return result;
    }
};
