
public class AddSumFun {
	public static void fsum(int m, int n)
	{
		int sum = 0;
		for(int i=m;i<=n;i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void f() 
	{
		System.out.println("没有参数也需要带括号哦");
	}

	public static void main(String[] args) {
		fsum(0,20);
		fsum(2,3);
		fsum(-9,12);
		f();
		

	}

}
