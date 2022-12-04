import java.util.Scanner;

public class Program {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int	num = scanner.nextInt();
		int	del = 2;
		int	count = 1;

		if (num <= 1)
		{
			System.err.println("Illegal Argument");
			System.exit(-1);
		}

		while ((del * del <= num) && (num % del != 0))
		{
			del++;
			count++;
		}

		if (del * del > num)
			System.out.println("true " + count);
		else
			System.out.println("false " + count);
	}
}