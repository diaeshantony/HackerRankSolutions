package CommonChild;

import java.util.Scanner;

/*
 Common Child
*/

public class CommonChild {

   public static void main (String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
	String s2 = sc.next();

	System.out.print(commonChild(s1, s2));
   }

   private static int commonChild(String s1, String s2) {
        return findLCS(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
    }

   private static int findLCS(char[] X, char[] Y, int m, int n) {
        int[][] memo = new int[m+1][n+1];

	for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    memo[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    memo[i][j] = memo[i-1][j-1] + 1;
                } else {
                    memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
                }
            }
        }
        return memo[m][n];
    }
}
