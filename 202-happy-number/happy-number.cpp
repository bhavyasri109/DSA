class Solution {
public:
    int ds(int n) {
        int s = 0;
        while (n != 0) {
            int r = n % 10;
            s += r * r;
            n /= 10;
        }
        return s;
    }
    bool isHappy(int n) {
        vector<int> l;
        while (n != 1 && find(l.begin(), l.end(), n) == l.end()) {
            l.push_back(n);
            n = ds(n);
        }
        return n == 1;
    }
};
