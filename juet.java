
import java.io.*;

class GetSet {


	private String name;

	public String getName() { return name; }

	public void setName(String N)
	{

		this.name = N;
	}
}

class juet {

	public static void main(String[] args)
	{
	
		GetSet obj = new GetSet();

		
		obj.setName("jaypee university");
		
		System.out.println(obj.getName());
	}
}
   
