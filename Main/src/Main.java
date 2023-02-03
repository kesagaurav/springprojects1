import java.util.*;
public class Main {

	public static void main(String[] args) {

		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("gaurav", 1);
		hm.put("sri", 2);
		hm.put("uday", 3);
		hm.put("rama", 4);
		System.out.print(hm);
		System.out.println("-------------------------------------");
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);
			
		}
		System.out.println(hm.keySet() + " value is " + hm.values());
		//hm.computeIfPresent("deepa", (key,val)->val + 1);
		hm.computeIfAbsent("gaurav", k->0+0);
		System.out.println(hm);
	}

}
