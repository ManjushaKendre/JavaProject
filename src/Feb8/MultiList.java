package Feb8;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class MultiList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>(); //list within another list
       
		ArrayList<Integer>list1 = new ArrayList<>(); // we create a list which is type of intger
		ArrayList<Integer>list2 = new ArrayList<>();
		ArrayList<Integer>list3 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		
		list3.add(45);
		list3.add(4);
		list3.add(6);
		
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		
		System.out.println(lists);		
		
		
		ArrayList<Integer> temp = lists.get(2); //get 2 list from 3 list which is present in main lists
		System.out.println(temp);
		
		System.out.println(temp.get(1));// get the 2 element from list 2 
		
		
		System.out.println(lists.get(0).get(2)); // above 2 statements combine in 1 line
		
		System.out.println(lists.get(1).get(3)); // list always start with 0 index 0,1,2..
		
		System.out.println(lists.get(0).get(1));
		
	}

}
