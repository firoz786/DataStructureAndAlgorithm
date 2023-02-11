package backtracking;

public class JosephusProblem
{

	public static void main(String[] args)
	{
		int n=9;
		int k=5;
		System.out.println(solution(n,k));
	}

	private static int solution(int n, int k)
	{
		if(n==1)
			return 0;
		int x=solution(n-1,k);
		int y=(x+k)%n;
		return y;
	}

}
