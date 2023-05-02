
import java.util.ArrayList;
import java.util.List;


import com.bridgelab.model.Patient;
import com.bridgelab.repository.JsonCliniqueConnection;
import com.bridgelab.utility.Utility;

public class Test 
{
   public static void main(String[] args) {
	   JsonCliniqueConnection connection=new JsonCliniqueConnection();

	   System.out.println("Enter ");
	   int n=Utility.inputInt();
	   List<Patient> list=new ArrayList<Patient>();
	   for(int i=0;i<n;i++)
	   {
		   Patient p=new Patient();
		    System.out.println("Enter name");
		   p.setName(Utility.inputString());
		   System.out.println("Enter age");		   
		   p.setAge(Utility.inputInt());
		   System.out.println("Enter mobile");
		   p.setMobileno(Utility.inputLong());
		   System.out.println("Enter appointment");
		   p.setAppointment(Utility.inputString());
		   list.add(p);
	   }
	   connection.writePatientList(list);
	   
}
}
