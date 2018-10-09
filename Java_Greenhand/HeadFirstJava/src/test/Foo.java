package test;

public class Foo {
	int x = 12;
	
	public void go(final int x) {
		System.out.println(x);
	}
	
	public static void main(String[] agrs) {
		Foo f = new Foo();
		f.go(11);
	}

}
