import java.util.*;

public class J3
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int limit = s.nextInt();
		int[] a = new int[limit];
		int[] b = new int[limit];
		for (int i = 0; i < limit; i++)
		{
			String[] c = s.next().split(",");
			a[i] = Integer.parseInt(c[0]);
			b[i] = Integer.parseInt(c[1]);
		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.print((a[0]-1) + "," + (b[0]-1) + "\n" + (a[limit-1]+1) + "," + (b[limit-1]+1));
	}
}
