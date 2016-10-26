import java.util.Scanner;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		int bingo[][] = new int[5][5];
		int speak[] = new int[25];
		int answer[] = {-1, -1, -1, -1, -1};
		int cnt = 0;
		int colSum = 0, rowSum = 0, leftSum = 0, rightSum = 0;

		for(int i = 0; i < 25; i++)
		{
			bingo[i / 5][i % 5] = scan.nextInt();
		}

		for(int i = 0; i < 25; i++)
		{
			speak[i] = scan.nextInt();
		}

		for(int i = 0; i < 11; i++)
		{
			for(int j = 0; j < 25; j++)
			{
				if(bingo[j / 5][j % 5] == speak[i])
				{
					bingo[j / 5][j % 5] = -1;
					break;
				}
			}
		}

		for(int i = 11; i < 25; i++)
		{
			for(int j = 0; j < 25; j++)
			{
				if(bingo[j / 5][j % 5] == speak[i])
				{
					bingo[j / 5][j % 5] = -1;
					break;
				}
			}

			for(int k = 0; k < 5; k++)
			{
				colSum = bingo[k][0] * answer[0] + bingo[k][1] * answer[1] + bingo[k][2] * answer[2] + bingo[k][3] * answer[3] + bingo[k][4] * answer[4];
				rowSum = bingo[0][k] * answer[0] + bingo[1][k] * answer[1] + bingo[2][k] * answer[2] + bingo[3][k] * answer[3] + bingo[4][k] * answer[4];

				if(colSum == 5)
					cnt++;
				if(rowSum == 5)
					cnt++;

				colSum = 0;
				rowSum = 0;
			}
			
			leftSum = bingo[0][0] * answer[0] + bingo[1][1] * answer[1] + bingo[2][2] * answer[2] + bingo[3][3] * answer[3] + bingo[4][4] * answer[4];
			rightSum = bingo[0][4] * answer[0] + bingo[1][3] * answer[1] + bingo[2][2] * answer[2] + bingo[3][1] * answer[3] + bingo[4][0] * answer[4];

			if(leftSum == 5)
				cnt++;
			if(rightSum == 5)
				cnt++;

			leftSum = 0;
			rightSum = 0;

			if(cnt >= 3)
			{
				System.out.printf("%d", i + 1);
				return;
			}
			else
				cnt = 0;
		}

		System.out.printf("%d", 21);
		return;
	}
}