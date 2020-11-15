import java.util.Scanner;

public class J1
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for (int i=1; i<=3; i++)
		{
			sum += i * s.nextInt();
		}

		if (sum < 10)
			System.out.print("sad");
		else
			System.out.print("happy");
	}
}
