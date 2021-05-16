package UtopianTree;

import java.util.Scanner;

//Utopian Tree HackerRank Challenge

public class UtopianTree {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int cycle = sc.nextInt();
			int result = UtopianTreeSoln(cycle);
			System.out.print(result);
		}
	}

	private static int UtopianTreeSoln(int n) {
		return (1 << ((n >> 1) + 1)) - 1 << n % 2;
	}
}
