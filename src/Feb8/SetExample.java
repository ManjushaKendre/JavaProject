package Feb8;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Maharashtra");
		set.add("Karnataka");
		set.add("Gujarat");
		set.add("Telangana");
		set.add("Karnataka");
		set.add("Karnataka");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		// methods of set
		
		set.add("Goa");
		System.out.println(set);
		
         set.remove("Goa");
         
         System.out.println(set);
         
         for (String s : set) {  // each for 
        	 
        	 
        	 System.out.println(s);
			
		}
 		}

}
