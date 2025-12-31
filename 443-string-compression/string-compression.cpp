class Solution {
public:
    int compress(vector<char>& chars) {
        int write = 0, read = 0;
        int n = chars.size();
        while (read < n) {
            char ch = chars[read];
            int count = 0;
            while (read < n && chars[read] == ch) {
                read++;
                count++;
            }
            chars[write++] = ch;
            if (count > 1) {
                int start = write;
                while (count > 0) {
                    chars[write++] = (count % 10) + '0';
                    count /= 10;
                }
                reverse(chars.begin() + start, chars.begin() + write);
            }
        }
        return write;
    }
};
