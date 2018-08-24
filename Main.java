import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] power_coe = new int[101];
		int count = 0;
		do
		{
			int p = in.nextInt();
			int c = in.nextInt();
			power_coe[p] = power_coe[p] + c;
			if(p == 0) {
				count += 1;
			}
		}while(count <2);
		
		int cnt = 0;
		for(int i=100;i>0;i--)
		{
			if(power_coe[i] != 0)
			{
				if(cnt != 0)
				{
					if( i != 1)
					{
						if(power_coe[i]>0)
						{
							System.out.print("+"+power_coe[i]+"x"+i);
						}
						else
						{
							System.out.print(power_coe[i]+"x"+i);
						}
					}
					else
					{
						if(power_coe[i]>0)
						{
							System.out.print("+"+power_coe[i]+"x");
						}
						else
						{
							System.out.print(power_coe[i]+"x");
						}
					}
				}
				else
				{
					if(i != 1)
					{
						System.out.print(power_coe[i]+"x"+i);
					}
					else
					{
						System.out.print(power_coe[i]+"x");
					}
					cnt = cnt + 1;
				}
			}
		}
		if(power_coe[0] != 0)
		{
			if(power_coe[0] > 0)
			{
				System.out.print("+"+power_coe[0]);
			}
			else
			{
				System.out.print(power_coe[0]);
			}
		}
	}
}
