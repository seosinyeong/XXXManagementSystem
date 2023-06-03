package echo;
import java.util.Scanner;

public class Echo{
	
	public static void main(String[] args) {
		Scanner input;
		input= new Scanner(System.in);
		System.out.print("input:");
		String echo = input.nextLine();
		System.out.println(echo);
	}
}
