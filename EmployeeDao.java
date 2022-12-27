package EmployeeSort;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public List<EmployeeModel> getModels(){
		
	List<EmployeeModel> emp=new ArrayList<>();
	emp.add(new EmployeeModel(100,"gan","kochi",20000));
	emp.add(new EmployeeModel(100,"anee","tvm",20000));
	emp.add(new EmployeeModel(100,"sanee","che",20000));
	return emp;
	
	}
}
