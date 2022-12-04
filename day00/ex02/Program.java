import java.util.Scanner;

public class Program {
	private static void checkValidNum(int num) {
		if (num <= 1)
		{
			System.err.println("Illegal Argument");
			System.exit(-1);
		}
	}
	
	private static int sumDigitsNum(int num) {
		int	sum = 0;
		int	del = 10;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return (sum);
	}

	private static boolean numIsPrimy(int num) {
		int	del = 2;

		while ((del * del <= num) && (num % del != 0))
			del++;

		if (del * del > num)
			return (true);
		return (false);
	}

	public static void main(String [] args) {
		Scanner	scanner = new Scanner(System.in);
		final int	EOF = 42;
		int			num;
		int			sumDigits;
		int			countRequest = 0;

		num = scanner.nextInt();
		while (num != 42) {
			checkValidNum(num);
			sumDigits = sumDigitsNum(num);
			if (numIsPrimy(sumDigits))
				countRequest++;
			num = scanner.nextInt();
		}
		System.out.println("Count of coffee-request - " + countRequest);
	}
}