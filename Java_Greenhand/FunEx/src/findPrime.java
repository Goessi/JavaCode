import java.util.Scanner;

public class findPrime {
	public static boolean isPrime(int n)
	{
		boolean isP = true;
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)
			{
				isP = false;
				break;
			}
			
		}
		return isP;
	}
	
	public static int ArrMul(int[] a)
	{
		int m = 1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				m = m*a[i];
			}			
		}
		return m;
	}
	
	public static int[] ArrPrime(int n)
	{
		int[] Arr = new int[n];
		int cnt = 0;
		for(int i=2;i<=n;)
		{
			if(isPrime(i)&&n%i == 0)
			{
				Arr[cnt] = i;
				cnt = cnt + 1;
				n = n/i;
			}
			else
			{
				i = i + 1;
			}
		}
		return Arr;
	}

	public static void main(String[] args) {
//		System.out.println(isPrime(15));
//		
//		int[] b = {1,2,0};
//		
//		System.out.println(ArrMul(b));
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = ArrPrime(num);
		int cnt = 0;
		if(isPrime(num))
		{
			System.out.println(num+"="+num);
		}
		else
		{
			System.out.print(num+"=");
			for(int i=0;i<arr.length;i++)
			{
				if(cnt == 0)
				{
					System.out.print(arr[i]);
					cnt = cnt + 1;
					continue;
				}
				
				if(arr[i]!=0)
				{
					System.out.print("x"+arr[i]);
				}		
				
			}
		}

	}

}
