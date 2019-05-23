
import javax.swing.JOptionPane;
 
public class CarInfo
{

	String name;
	String model;
	String company;
	String name1;
	String qualifications;
	String post;

	//constructor
	public CarInfo(String n,String m,String cm,String n1,String q,String po)
	{
		name = n;
		model = m;
		company = cm;
		name1 = n1;
		qualifications = q;
		post = po;
	}
	public void print()
	{
		JOptionPane.showMessageDialog(null , "Name: " +name +"\nModel: " + model + "\nCompany: " + company);
	}
	
}
	
