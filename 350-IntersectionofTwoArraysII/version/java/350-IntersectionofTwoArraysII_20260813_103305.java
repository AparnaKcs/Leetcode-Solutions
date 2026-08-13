// Last updated: 8/13/2026, 10:33:05 AM
1import java.util.*;
2
3class Solution {
4    public int[] intersect(int[] nums1, int[] nums2) {
5
6        ArrayList<Integer> result = new ArrayList<>();
7
8        for (int i = 0; i < nums1.length; i++) {
9
10            for (int j = 0; j < nums2.length; j++) {
11
12                if (nums1[i] == nums2[j]) {
13
14                    result.add(nums1[i]);
15
16                    nums2[j] = -1;
17
18                    break;
19                }
20            }
21        }
22
23        int[] answer = new int[result.size()];
24
25        for (int i = 0; i < result.size(); i++) {
26            answer[i] = result.get(i);
27        }
28
29        return answer;
30    }
31}