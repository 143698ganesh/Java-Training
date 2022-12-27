package EmpPf;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import functionalInterface.EmployeeDao;
import functionalInterface.EmployeeModel;

public class EmployeeService {

	public static void main(String[] args) {
		List<EmployeeModel> lists = new EmployeeDao().getModels();
		
		for (EmployeeModel emp : lists) {

			if (0 < emp.getSalary() && 25000 > emp.getSalary()) {

			System.out.println("id: " + emp.getId() + ", name: " + emp.getName() + ", location: "

			+ emp.getLocation() + ", Actual salary: " + emp.getSalary() + ", PF-amount: "

			+ emp.getSalary() * 5 / 100 + ", In hand salary: " + emp.getSalary() * 95 / 100);

			 

			} else if (25000 < emp.getSalary() && 50000 > emp.getSalary()) {

			System.out.println("id: " + emp.getId() + ", name: " + emp.getName() + ", location: "

			+ emp.getLocation() + ", Actual salary: " + emp.getSalary() + ", PF-amount: "

			+ emp.getSalary() * 7 / 100 + ", In hand salary: " + emp.getSalary() * 93 / 100);

			} else if (50000 < emp.getSalary() && 80000 > emp.getSalary()) {

			System.out.println("id: " + emp.getId() + ", name: " + emp.getName() + ", location: "

			+ emp.getLocation() + ", Actual salary: " + emp.getSalary() + ", PF-amount: "

			+ emp.getSalary() * 12 / 100 + ", In hand salary: " + emp.getSalary() * 88 / 100);

			} else if (80000 == emp.getSalary()) {

			System.out.println("id: " + emp.getId() + ", name: " + emp.getName() + ", location: "

			+ emp.getLocation() + ", Actual salary: " + emp.getSalary() + ", PF-amount: "

			+ emp.getSalary() * 18 / 100 + ", In hand salary: " + emp.getSalary() * 82 / 100);

			} else if (80000 < emp.getSalary()) {

			System.out.println("id: " + emp.getId() + ", name: " + emp.getName() + ", location: "

			+ emp.getLocation() + ", Actual salary: " + emp.getSalary() + ", PF-amount: "

			+ emp.getSalary() * 20 / 100 + ", In hand salary: " + emp.getSalary() * 80 / 100);

			}

			 

			}

			 

			}
}



