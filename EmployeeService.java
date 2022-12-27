package EmpSalary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import EmployeeSort.EmployeeDao;

public class EmployeeService {

	public static void main(String[] args) {
		List<EmployeeModel> e= new EmployeeDao().getEmployeesList();
		Map<Integer, EmployeeModel> map = new HashMap<>();
		for(EmployeeModel e1: e) {
			if(map.containsKey(e1.getSalary())) {
				EmployeeModel em = map.get(e1.getSalary());
				map.put(e1.getSalary(), new EmployeeModel(e1.getId(),e1.getName(),e1.getSalary()+ em.getSalary()));
			}
				else {
					map.put(e1.getSalary(), new EmployeeModel(e1.getId(),e1.getName(),e1.getSalary()));
				}	
			
		}
  System.out.println(map);
	}

}
