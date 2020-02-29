package january12;

public class Execution {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Student amol = new Student("Amol",123,"COEP","Mechaincal");
		amol.attendsLecture();
		amol.goesToCollege();
		amol.studiesInDepartment();
		
		Student saloni = new Student ("Saloni",456,"Savitribai Phule","IT");
		saloni.attendsLecture();
		saloni.goesToCollege();
		saloni.studiesInDepartment();
		
		Student ajay = new Student("Ajay",124,"Computer");
		ajay.attendsLecture();
		ajay.goesToCollege();
		ajay.studiesInDepartment();
		
		
		String result = ajay.returnName();
		System.out.println(" " + result);
		
		int  id = ajay.returnid();
		System.out.println(" " + id);
		

	}

}
