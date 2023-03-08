package week3.Week3Day3;

public class Assignment1RemoveDuplicates {

	public static void main(String[] args) {
		String string = "We learn java basics as part of java sessions in java week1";  	        

		string = string.toLowerCase();  

		String words[] = string.split(" ");  

		for(int i = 0; i < words.length; i++) {  	             
			for(int j = i+1; j < words.length; j++) {  
				if(words[i].equals(words[j])) {  
					words[j] = "";  
				}	                
			}  
			System.out.print(words[i]+" ");   
		}  

	}

}
