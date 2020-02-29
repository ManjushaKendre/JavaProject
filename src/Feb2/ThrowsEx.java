package Feb2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ThrowsEx {

	public static void main(String[] args)  throws Exception
	{
		// TODO Auto-generated method stub
		
      myException("chrom");
	}
	
	public void openFile(String path) throws FileNotFoundException
	{
		
		File fh = new File(path);
		
		FileInputStream  io =  new  FileInputStream(fh);
		
	}
	
	public static  void myException(String browserName) throws Exception
	{
		
		if (browserName.equals("chrome"))
		{
			
		System.out.println("Browser is chrome");
		
		}
		else if (browserName.equals("Firefox"))
		{
			
		System.out.println("Browser is Firefox");
		
		} 
		
		else 
		{
			
			throw new Exception("Invalid Browser");
		}
	}
 
}

