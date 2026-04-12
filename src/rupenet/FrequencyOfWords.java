package rupenet;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FrequencyOfWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String words[] = str.split(" ");
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<words.length;i++) {
			if(map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i])+1);
			}
			else {
				map.put(words[i], 1);
			}
		}
		for(String key : map.keySet()) {
			
			System.out.println(key + " = "+ map.get(key));
		}

	}

}
