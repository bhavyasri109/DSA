class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0, j = 0;
        ArrayList<int[]> list = new ArrayList<>();
        while (i < firstList.length && j < secondList.length) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end   = Math.min(firstList[i][1], secondList[j][1]);
            if (start <= end) {
                list.add(new int[]{start, end});
            }
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        int[][] result = new int[list.size()][2];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }
}
