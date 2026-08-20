// Last updated: 8/20/2026, 6:07:53 PM
1class Solution {
2    public int nthUglyNumber(int n) {
3
4        int[] ugly = new int[n];
5
6        ugly[0] = 1;
7
8        int i2 = 0;
9        int i3 = 0;
10        int i5 = 0;
11
12        for (int i = 1; i < n; i++) {
13
14            int a = ugly[i2] * 2;
15            int b = ugly[i3] * 3;
16            int c = ugly[i5] * 5;
17
18            ugly[i] = Math.min(a, Math.min(b, c));
19
20            if (ugly[i] == a) {
21                i2++;
22            }
23
24            if (ugly[i] == b) {
25                i3++;
26            }
27
28            if (ugly[i] == c) {
29                i5++;
30            }
31        }
32
33        return ugly[n - 1];
34    }
35}