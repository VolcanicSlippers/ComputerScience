public class SumSqrt {
	
	/** Calculate the sum of the square roots of the elements of an array.
	 * @param a This is the array that we will be creating that inside of it, computes the sum of the sqaure rooted values.
	 * @return  Sum (i = 0 to a.length-1) Math.sqrt(a[i])
	 */

	public static double sumSqrt(double[] a) {
		double sum = 0.0;
		for(int i = 0; i<a.length; i++) {
			sum = sum + Math.sqrt(a[i]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		double[] array =  {2,10,30,44,9};
		
		System.out.println(sumSqrt(array));
	}
}
