
public class initArray {

	public static void main(String[] args) {
		// Array is different from other variables
		// once it is been innitialized, the array is stored in somewhere else
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5};
		System.out.println(a==b);
		
		int[] c = a;
		c[0] = 22;
		System.out.println(a[0]);
		System.out.println(a==c);
		
		// if you want to copy b from a
		// please use loop
		// to compare b with a, use loop tooooooooo
		
		int[] d = new int[a.length];
		for(int i=0;i<d.length;i++) {
			d[i] = a[i];
		}
		for(int j=0;j<d.length;j++) {
			System.out.print(d[j]+" ");
		}

	}

}
