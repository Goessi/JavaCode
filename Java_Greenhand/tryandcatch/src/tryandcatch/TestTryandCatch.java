package tryandcatch;

public class TestTryandCatch {
	public void k() {
		int [] a = new int[10];
		a[10] = 100;
	}

	public static void main(String[] args) {
		TestTryandCatch m = new TestTryandCatch();
		try {
			m.k();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}

	}

}
