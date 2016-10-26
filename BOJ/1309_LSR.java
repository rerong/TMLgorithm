import java.util.Scanner;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
        int num;
		num = scan.nextInt();
        int dp[] = new int[100001];
        dp[0] = 1;
        dp[1] = 3;

		for(int i = 2; i <= num; i++)
        {
            dp[i] = (dp[i-1] * 2 + dp[i-2]) % 9901;
        }
        
		System.out.printf("%d", dp[num]);
	}
}