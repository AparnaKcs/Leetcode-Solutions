// Last updated: 8/20/2026, 6:26:59 PM
1class Solution {
2    public int countPrimes(int n) {
3
4        if (n <= 2) {
5            return 0;
6        }
7
8        boolean[] notPrime = new boolean[n];
9
10        for (int i = 2; i * i < n; i++) {
11
12            if (notPrime[i] == false) {
13
14                for (int j = i * 2; j < n; j = j + i) {
15                    notPrime[j] = true;
16                }
17            }
18        }
19
20        int count = 0;
21
22        for (int i = 2; i < n; i++) {
23
24            if (notPrime[i] == false) {
25                count++;
26            }
27        }
28
29        return count;
30    }
31}