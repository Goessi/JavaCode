import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// tic-tac-toe 
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int no1 = 0;
		int no0 = 0;
		boolean gotRe = false;
		// build board
		int[][] board = new int[l][l];
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j] = sc.nextInt();
			}
		}
		
		// first: check lines
		for(int i=0;i<board.length;i++)
		{
			no1 = 0;
			no0 = 0;
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j]==0)
				{
					no0 += 1;
				}
				else
				{
					no1 += 1;
				}
			}
			if(no0 == l||no1 == l)
			{
				gotRe = true;
				break;
			}
		}
		
		// check columns
		if(!gotRe) {
			for(int j=0;j<board[0].length;j++)
			{
				no1 = 0;
				no0 = 0;
				for(int i=0;i<board.length;i++)
				{
					if(board[i][j] == 1)
					{
						no1 = no1 + 1;
					}
					else
					{
						no0 = no0 + 1;
					}
				}
				if(no1 == l||no0 == l)
				{
					gotRe = true;
					break;
				}
			}
		}
		
		
		// check diagonal line
		if(!gotRe)
		{
			no1 = 0;
			no0 = 0;
			for(int i=0;i<board.length;i++) 
			{
				if(board[i][i] == 1)
				{
					no1 += 1;
				}
				else
				{
					no0 += 1;
				}
			}
			if(no1 == l|| no0 == l)
			{
				gotRe = true;
			}
		}
		
		// check back-diagonal line
		if(!gotRe)
		{
			int j = 0;
			no1 = 0;
			no0 = 0;
			for(int i=0;i<board.length;i++) 
			{
				j = l - i - 1;
				if(board[i][j] == 1)
				{
					no1 += 1;
				}
				else
				{
					no0 += 1;
				}
			}
			if(no1 == l|| no0 == l)
			{
				gotRe = true;
			}
		}
		
		if(gotRe) {
			if(no1 == l) {
				System.out.println("X");
			}
			else
			{
				System.out.println("O");
			}
		}
		else
		{
			System.out.println("NIL");
		}

	}

}
