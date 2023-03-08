package week3.Week3Day3;

import java.util.HashMap;
import java.util.Map;

public class MapClassRommActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="amazon development Center";
		char[] ch = name.toCharArray();
	
		Map<Character, Integer> mapObj = new HashMap<Character, Integer>();
		
		for(int i=0; i<ch.length;i++) {
			if(mapObj.containsKey(ch[i])) {
				Integer addCount = mapObj.get(ch[i]);
				mapObj.put(ch[i], addCount+1);
			}else
				mapObj.put(ch[i],1);
		}
		System.out.println(mapObj);
	}

}
