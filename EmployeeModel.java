package EmpPf;

public class EmployeeModel {
	public int id;
	public String name;
	public String location;
	public double salary;
	public EmployeeModel(int id,String name,String location,double salary) {
		super();
		this.id=id;
		this.name=name;
		this.location=location;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
