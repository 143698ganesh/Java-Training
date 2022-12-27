package EmpSalary;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
		
		List<EmployeeModel> getEmployeesList (){
			List<EmployeeModel> p = new ArrayList<>();
			p.add(new EmployeeModel(1, "Arun", 10000));
			p.add(new EmployeeModel(2, "Anu", 10000));
			p.add(new EmployeeModel(3, "Hari", 90000));
			
			return p;
			
		}
	
	}

