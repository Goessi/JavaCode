import java.util.Scanner;

public class PolyAdd {

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		int[] power_coe = new int[101];
//		int count = 0;
//		do
//		{
//			int p = in.nextInt();
//			int c = in.nextInt();
//			power_coe[p] = power_coe[p] + c;
//			if(p == 0) {
//				count += 1;
//			}
//		}while(count <2);
//		
//		int cnt = 0;
//		for(int i=100;i>0;i--)
//		{
//			if(power_coe[i] != 0)
//			{
//				if(cnt != 0)
//				{
//					if( i != 1)
//					{
//						if(power_coe[i]>0)
//						{
//							System.out.print("+"+power_coe[i]+"x"+i);
//						}
//						else
//						{
//							System.out.print(power_coe[i]+"x"+i);
//						}
//					}
//					else
//					{
//						if(power_coe[i]>0)
//						{
//							System.out.print("+"+power_coe[i]+"x");
//						}
//						else
//						{
//							System.out.print(power_coe[i]+"x");
//						}
//					}
//				}
//				else
//				{
//					if(i != 1)
//					{
//						System.out.print(power_coe[i]+"x"+i);
//					}
//					else
//					{
//						System.out.print(power_coe[i]+"x");
//					}
//					cnt = cnt + 1;
//				}
//			}
//		}
//		if(power_coe[0] != 0)
//		{
//			if(power_coe[0] > 0)
//			{
//				System.out.print("+"+power_coe[0]);
//			}
//			else
//			{
//				System.out.print(power_coe[0]);
//			}
//		}
	
		
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
		
		// 分开记录一些信息
		int first_num = 0;
		boolean[] po_na = new boolean[power_coe.length];
		int num = 0;
		boolean[] c_1 = new boolean[power_coe.length];
		for(int i=power_coe.length - 1;i>=0;i--)
		{
			// first_num
			if(power_coe[i] != 0) 
			{
				if(first_num == 0)
				{
					first_num = i; //记录第一个不为0的index
				}
				
				if(power_coe[i] > 0)
				{
					po_na[i] = true; //记录不为负数
				}
				
				if(Math.abs(power_coe[i]) == 1)
				{
					c_1[i] = true;
				}

			}
			
		}
				
		// 全为0
		if(first_num == 0)
		{
			System.out.println(0);
		}
		else
		{
			//打印第一个数
			if(c_1[first_num])
			{
				if(power_coe[first_num]<0)
				{
					System.out.print("-x");
				}
				else
				{
					System.out.print("x");
				}
			}
			else
			{
				System.out.print(power_coe[first_num]+"x");
			}
			if(first_num != 1)
			{
				System.out.print(first_num);
			}
			//打印剩余的数
			for(int j=first_num-1;j>0;j--)
			{
				if(power_coe[j] != 0)
				{
					if(po_na[j])
					{
						System.out.print("+");
						if(power_coe[j] == 1)
						{
							System.out.print("x");
						}
						else
						{
							System.out.print(power_coe[j]+"x");
						}
						if(j != 1)
						{
							System.out.print(j);
						}
					}
					else
					{
						if(power_coe[j] == -1)
						{
							System.out.print("-x");
						}
						else
						{
							System.out.print(power_coe[j]+"x");
						}
						if(j!=1)
						{
							System.out.print(j);
						}
					}
				}
				
			}
			//打印最后一个数
			if(power_coe[0] != 0)
			{
				if(po_na[0])
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
}
