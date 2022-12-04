public class Program {
	public static void main(String [] args) {
		int	num = 479598;
		int	sumDigits = 0;

		sumDigits += num % 10;
		sumDigits += num % 100 / 10;
		sumDigits += num % 1000 / 100;
		sumDigits += num % 10000 / 1000;
		sumDigits += num % 100000 / 10000;
		sumDigits += num % 1000000 / 100000;
		System.out.println(sumDigits);
	}
}