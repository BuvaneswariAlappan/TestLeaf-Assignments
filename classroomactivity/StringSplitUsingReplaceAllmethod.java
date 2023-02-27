package week2.day1.classroomactivity;

public class StringSplitUsingReplaceAllmethod {
	
	public static void main(String[] args) {
		String str = "Amazon have 1200 woodenproduct outof 100000";
        String[] splits = str.split(" ");
        for(int i=0;i<=splits.length-1;i++) {
        	System.out.println(splits[i]);
        }
        
        String repStr = str.replaceAll("[A-Z,a-z,0-999999999]", " ");
        System.out.println(repStr);
	}

}
