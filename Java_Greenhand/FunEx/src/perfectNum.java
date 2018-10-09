import java.util.Scanner;

public class perfectNum {
//	public static boolean isPrime(int a)
//	{
//		boolean isP = true;
//		for(int i=2;i<a;i++)
//		{
//			if(a%i == 0)
//			{
//				isP = false;
//				break;
//			}
//		}
//		return isP;
//	}
	
	public static boolean isPerfect(int a)
	{
		boolean isP = false;
		int sum = 0;
		for(int i=1;i<a;i++)
		{
			if(a%i == 0)
			{
				sum = sum + i;
			}
		}
		
		if(sum == a)
		{
			isP = true;
		}
		return isP;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int cnt = 0;
		int count = 0;
		
		boolean[] Arr = new boolean[m-n+1];
		
		for(int i=0;i<m-n+1;i++)
		{
			Arr[i] = isPerfect(i+n);
		}
		
		for(int j=0;j<m-n+1;j++)
		{
			if(cnt==0&&Arr[j])
			{
				System.out.print(j+n);
				cnt += 1;
				continue;
			}
			
			if(Arr[j])
			{
				System.out.print(" "+(j+n));
			}
			else
			{
				count += 1;
			}			
		}
		
		if(count == Arr.length)
		{
			System.out.println("NIL");
		}


		

	}

}
