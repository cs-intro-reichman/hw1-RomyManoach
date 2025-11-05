// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

		int num = Integer.parseInt(args[0]);
		int h = num % 1000 / 100;
		int t = num % 100 / 10;
		int o = num % 10;

		System.out.println(h + " hundreds, " + t + " tens, " + "and " + o + " ones.");
	}
}
