package week2.day1.Assignment_String;

public class ReverseEvenWords {

	// Reverse the letters of the word
	static void reverse(char str[],	int start, int end)
	{
		// Temporary variable to store character
		char temp;
		while (start <= end)
		{
			// Swapping the first and last character
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}

	// This function forms the required string
	static void reverseletter(char str[], int start, int end)
	{
		int wstart, wend;
		for (wstart = wend = start; wend < end; wend++)
		{
			if (str[wend] == ' ')
			{
				continue;
			}

			// Checking the number of words present in string to reverse
			while (wend <= end && str[wend] != ' ')
			{
				wend++;
			}
			wend--;

			// Reverse the letter of the words  			 
			reverse(str, wstart, wend);
		}
	}


	public static void main(String[] args)
	{
		char str[] = "Abi Babu Chinnu Dhyan Ezhil Fazil ".toCharArray();
		char str1[] = "I am a software tester".toCharArray();
		reverseletter(str, 0, str.length - 1);
		reverseletter(str1, 0, str1.length - 1);
		System.out.println( String.valueOf(str));
		System.out.println( String.valueOf(str1));
	}
}
