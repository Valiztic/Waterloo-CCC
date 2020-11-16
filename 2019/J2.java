import java.util.Scanner;

public class J2{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++)
		{
			int count = s.nextInt();
			char c = s.next().charAt(0);
			for (int b = 0; b < count; b++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}