package backtracking;

import java.util.Scanner;

public class RatInAMaze
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		scn.close();
		printMazePath(1, 1, m, n, "");
	}

	// sr= sourceRow
	// sc= sourceColumn
	// dr= destRow
	// dc= destColumn
	public static void printMazePath(int sr, int sc, int dr, int dc, String psf)
	{
		if(sc>dc || sr>dr)
			return;
		if(sc==dc && sr==dr)
			System.out.println(psf);
		printMazePath(sr, sc+1, dr, dc, psf+"h");
		printMazePath(sr+1, sc, dr, dc, psf+"v");
	}

}
