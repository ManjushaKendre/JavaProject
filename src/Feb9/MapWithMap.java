package Feb9;
import java.util.ArrayList;
import java.util.HashMap;

public class MapWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we create hasmap which string witin that another hashmap which is Integertype of arraylist 
		// which contian string data
		
		HashMap<String,HashMap<Integer,ArrayList<String>>> map = new HashMap<>();
		
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();
		
		HashMap<Integer,ArrayList<String>> details = new HashMap<>();
		HashMap<Integer,ArrayList<String>> details1 = new HashMap<>();

		HashMap<Integer,ArrayList<String>> details2 = new HashMap<>();

		
		
		list1.add("Amol Palekar");
		list1.add("Developer");
		list1.add("Java");
		
		
		list2.add("Ajay Kendre");
		list2.add("Developer");
		list2.add(".net");
		
		list3.add("Ram Shinde");
		list3.add("Tester");
		list3.add("Automation");
		
		details.put(1001, list1);
		details1.put(1002, list2);
		details2.put(1003, list3);
		
		map.put("Finance", details);
		map.put("Investment", details1);
		map.put("Marketing", details2);
		
		System.out.println(map.get("Investment").get(1002).get(0));
		
		
	}

}
