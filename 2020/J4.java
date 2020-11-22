import java.util.Scanner;

public class J4
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		int cycle = a.indexOf(b);
		for (int i = 0; i < b.length(); i++)
		{
			if (cycle >= 0)
			{
				break;
			}
			String n = b.substring(1, b.length());
			b = n + b.charAt(0);
			cycle = a.indexOf(b);
		}
		if (cycle >= 0)
			System.out.print("yes");
		else
			System.out.print("no");
	}
}
