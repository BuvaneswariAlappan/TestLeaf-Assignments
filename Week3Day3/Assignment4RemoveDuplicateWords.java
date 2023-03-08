package week3.Week3Day3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment4RemoveDuplicateWords {

	public static void main(String[] args) {
		String string = "We learn java basics as part of java sessions in java week1";
//		String string = "i like java java coding java and you do you interested in java coding coding.";

        System.out.print("Original String  : ");
        System.out.print(string);
        /*
         * Since the words are separated by space, we will split the string by
         * one or more space
         */

        final String[] strWords = string.split("\\s+");

        // convert String array to LinkedHashSet to remove duplicates
        final Set < String > setOfWords = new LinkedHashSet < String > (Arrays.asList(strWords));
        final StringBuilder builder = new StringBuilder();
        int index = 0;

        for (String s: setOfWords) {

            if (index > 0)
                builder.append(" ");

            builder.append(s);
            index++;
        }

        string = builder.toString();

        System.out.print("\nRemoved duplicate: ");
        System.out.print(string);
	}

}
