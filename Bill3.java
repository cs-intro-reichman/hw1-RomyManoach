// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2];
		String bill = args[3];

		double bill_num = Double.parseDouble(bill);
		bill_num = bill_num / 3;

		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + Math.ceil(bill_num) + " Shekels each.");
	}
}
