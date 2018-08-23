//created by Michael Kuhn

import java.util.Scanner;

public class TowersOfHanoi {
    
    public static int totalMoves = 0;
    
	public static void main(String[] args) {
		TowersOfHanoi towers = new TowersOfHanoi();
		System.out.println("Enter the number of discs: ");
		Scanner kb = new Scanner(System.in);
		int discs = kb.nextInt();
        totalMoves = 0;
        towers.solve(discs, "L", "C", "R");
        System.out.println("Total moves: " + totalMoves);
	}
	
	public void solve(int discs, String start, String auxiliary, String end) {
        if(discs == 1) {
            System.out.println(start + " -> " + end);
            totalMoves++;
        }
        if(discs > 1) {
            solve(discs-1, start, end, auxiliary);
            System.out.println(start + " -> " + end);
            totalMoves++;
            solve(discs-1, auxiliary, start, end);
        }
	}
}
