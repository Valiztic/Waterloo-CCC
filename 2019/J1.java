import java.util.Scanner;

public class J1{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		for (int i = 3; i > 0; i--){
			a += s.nextInt()*i;
		}
		for (int i = 3; i > 0; i--){
			b += s.nextInt()*i;
		}
		if (a > b)
			System.out.print("A");
		else if (a < b)
			System.out.print("B");
		else
			System.out.print("T");
	}
}
