// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int firstHour = Integer.parseInt("" + args[0].charAt(0));
		int secondHour = Integer.parseInt("" + args[0].charAt(1));
		int firstMinute = Integer.parseInt("" + args[0].charAt(3));
		int secondMinute = Integer.parseInt("" + args[0].charAt(4));
		// Does the same with the minutes part of the input.
		int hours = (firstHour * 10) + secondHour;
		int minutes = (firstMinute * 10) + secondMinute;
		String ampm = "";

        if (hours==00) {
			System.out.print("0:");
			ampm = "AM";
		}
			else if (hours < 12 && hours !=00) {
			System.out.print(hours + ":");
			ampm = "AM";
		}
			else if (hours == 12) {
			System.out.print(hours + ":");
			ampm = "PM";	
		}
			else if (hours>12) {
			System.out.print(hours-12 + ":");
			ampm = "PM";
		}

		if (minutes < 10) {
			System.out.print("0" + minutes + " " + ampm);
		}
		else
			System.out.print(minutes + " " + ampm);
	}
}