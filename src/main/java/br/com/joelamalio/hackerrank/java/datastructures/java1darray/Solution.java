package br.com.joelamalio.hackerrank.java.datastructures.java1darray;

import java.util.Scanner;

public class Solution {
	
	public static boolean canWin(int leap, int[] game) {
		return toMove(0, leap, game, true, false, true);
	}
	
	private static boolean isFinished(int actualPosition, int length) {
		return actualPosition >= length;
	}
	
	private static boolean toMove(int position, int leap, int[] game, 
			boolean canGoForward, boolean canComeBack, boolean canJump) {
		int nextMove = 0;
		boolean finished = false;
		boolean canNextMove = false;
		
		if (canGoForward) {
			nextMove = position + 1;
			finished = isFinished(nextMove, game.length);
			if (finished) {
				return true;
			}
			
			canNextMove = nextMove < game.length && game[nextMove] == 0;
			if (canNextMove) {
				System.err.println(String.format("avançar de %d para %d", position, nextMove));
				finished = toMove(nextMove, leap, game, true, true, true);
			}
		}
		
		if (!finished && canJump) {
			nextMove = position + leap;
			finished = isFinished(nextMove, game.length);
			if (finished) {
				return true;
			}
			
			canNextMove = nextMove < game.length && game[nextMove] == 0;
			if (canNextMove) {
				System.err.println(String.format("pular de %d para %d", position, nextMove));
				finished = toMove(nextMove, leap, game, true, true, true);
			}
		}
		
		if (!finished && canComeBack) {
			nextMove = position - 1;
			canNextMove = nextMove > 0 && game[nextMove] == 0;
			if (finished) {
				return true;
			}
			
			if (canNextMove) {
				System.err.println(String.format("voltar de %d para %d", position, nextMove));
				finished = toMove(nextMove, leap, game, false, true, true);
			}
		}
		
		System.err.println(String.format("===> %d", position));

		return finished;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}
