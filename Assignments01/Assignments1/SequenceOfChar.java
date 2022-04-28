package Assignments1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface character {

	void show();
}

public class SequenceOfChar {
	public static void main(String[] args) {
		character obj = () -> {
			String text = "vaibhavyashwanttayade";
			String wordfind = "yash";

			Pattern word = Pattern.compile(wordfind);
			Matcher match = word.matcher(text);

			while (match.find()) {

				System.out.println(
						" between index " + match.start() + " and " + match.end() + " " + wordfind + " char found ");

			}
		};
		obj.show();
	}
}
