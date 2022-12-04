import java.util.Scanner;

public class Program {
	private static int defineMark(Scanner scanner) {
		final int	MAX = 9;
		int			minMark, mark;

		minMark = scanner.nextInt();
		if (minMark > MAX)
		{
			System.err.println("Illegal Argument");
			System.exit(-1);
		}
		for (int i = 0; i < 4; i++) {
			mark = scanner.nextInt();
			if (mark > MAX)
			{
				System.err.println("Illegal Argument");
				System.exit(-1);
			}
			if (minMark > mark)
				minMark = mark;
		}
		return (minMark);
	}

	private static void	printResult(long res)
	{
		long	mark, del = 10;
		int 	i = 1;

		while (res / del > 0)
			del *= 10;
		while (del != 1)
		{
			mark = res % del / (del / 10);
			System.out.print("Week " + i + " ");
			while (mark > 0)
			{
				System.out.print("=");
				mark--;
			}
			System.out.println(">");
			i++;
			del /= 10;
		}
	}

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		final int		LAST = 18;
		final String    EOF = "42";
		String			week;
		int				numWeek, tmpNumWeek;
		int				mark = 0;
		long 			result = 0;
		int				countWeek = 1;

		week = scanner.next();
		if (week.equals(EOF))
			System.exit(0);
		
		numWeek = scanner.nextInt();
		while (countWeek <= LAST)
		{
			mark = defineMark(scanner);
			result = result * 10 + mark;
			week = scanner.next();
			if (week.equals(EOF))
				break ;
			tmpNumWeek = numWeek;
			numWeek = scanner.nextInt();
			if (tmpNumWeek >= numWeek)
			{
				System.err.println("Illegal Argument");
				System.exit(-1);
			}
			countWeek++;
		}
		printResult(result);
	}
}