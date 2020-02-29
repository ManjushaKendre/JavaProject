package january12;

public class Student {
	String name;
	int id;
	String collegeName;
	String department;
	
	Student(String iname,int iid,String icollege,String idepartment)
	{
		
		name = iname;
		id = iid;
		collegeName = icollege;
		department = idepartment;
		
		
	}
	
	Student(String iname,int iid,String iDepartment)
	{
		
		name = iname;
		id = iid;
		department = iDepartment;
		
	}

	
	
		
	
void attendsLecture()
{
	
System.out.println(name + " attends lecture");

}
void goesToCollege()
{
	System.out.println(name + " goes to college");
	
}
void studiesInDepartment()
{
	System.out.println(name +  " studies in department" + department);
}

String returnName()
{
	
return name;

}
int  returnid()
{
	return id;
}
}
