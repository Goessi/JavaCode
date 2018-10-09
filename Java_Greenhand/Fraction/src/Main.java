import java.util.Scanner;

class Fraction {
	
	private int numerator = 0;
	private int denominator = 0;
	
	public Fraction(int a,int b) {
		numerator = a;
		denominator = b;
	}
	
	public double toDouble() {
		double haha = (double)numerator/denominator;
		return haha;
	}
	
	public Fraction plus(Fraction r) {
		int n = 0;
		int d = 0;
		if(this.numerator == 0) {
			n = r.numerator;
			d = r.denominator;
		}
		else if(r.numerator == 0) {
			n = this.numerator;
			d = this.denominator;
		}
		else {
			n = this.numerator*r.denominator+r.numerator*this.denominator;
			d = this.denominator*r.denominator;
		}
		
		Fraction f = new Fraction(n,d);
		return f;
	}
	
	public Fraction multiply(Fraction r) {
		int n = this.numerator*r.numerator;
		int d = this.denominator*r.denominator;
		Fraction f = new Fraction(n,d);
		return f;
	}
	
	public void print() {
		int[] haha = new int[2];
		haha =  findP(this.numerator,this.denominator);
		numerator = haha[0];
		denominator = haha[1];
		if(denominator == 1) {
			System.out.println(this.numerator);
		}
		else if(numerator==0) {
			System.out.println(0);
		}
		else {
			System.out.println(this.numerator+"/"+this.denominator);
		}
		
	}
	
	//寻找公约数后化简
	public static int[] findP(int a,int b) {
		int haha[] = new int[2];
		int c =0;
		if(a==b&&a!=0) {
			a = 1;
			b = 1;
		}
		else 
		{
			if(a>b) 
			{
				c = b;
			}
			else 
			{
				c = a;
			}
			for(int i=2;i<=c;i++) {
				if(a%i==0&&b%i==0) {
					a = a/i;
					b = b/i;
				}
			}
		}
		
		haha[0] = a;
		haha[1] = b;
		return haha;
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();

	}

}
