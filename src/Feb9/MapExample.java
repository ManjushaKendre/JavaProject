package Feb9;
import java.util.HashMap;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<>();
                            		
		map.put("Pune", 411014);  // To add entries in Map Put Keyword is used
		
		map.put("Nanded", 431605); // Nanded  is key and 431605 is value
		
		map.put("Mumbai", 400001);
		
		System.out.println(map);
		
		
		System.out.println(map.keySet()); // To find Keies  in map we use method Keyset()
														
		System.out.println(map.values()); // To Print Values in map we use method values()
		
		
		System.out.println(map.size()); // To show the size of map we use size() method
		
		map.replace("Pune",421702 ); // To replace Value method use replace()
		
		System.out.println(map);
		
		map.remove("Mumbai");  // To Delete Enteries we use Remove method 
		
		System.out.println(map);
		
		System.out.println(map.containsKey("Nashik")); // To find key
		
		System.out.println(map.containsValue(431605)); // To Find Value
		
		System.out.println(map.get("Pune")); // To get Index of key
		
		map.put("Nanded", 4401605); // replace the value of key
		
		System.out.println(map);
		
		for (String key : map.keySet()) {  // To get all values using keyset method
			
			System.out.println("Key : "+ key + " " + "Value: " + map.get(key)); // Print all the Key and Values in Map
			
			
		}
		
		
		
		
		
		
	
	}

}
