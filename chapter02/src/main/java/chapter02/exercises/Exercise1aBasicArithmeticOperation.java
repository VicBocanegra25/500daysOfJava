package chapter02.exercises;

/* 
 * Write method int calc(int, int) that multiplies two variables, m and n of type int,
then divides the product by two, and outputs the remainder with respect to division by 7.
 */
public class Exercise1aBasicArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc(6, 7);
		calc(3, 4);
		calc(5, 5);

	}
	
	public static int calc(int m, int n) {
		int result = (m * n / 2) % 7;
		System.out.println(result);
		return result;
	}

}
