package pancard;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import functionalInterface.EmployeeModel;

public class PanService {

	public static void main(String[] args) {
		List<String> lists =new PanDao().getModels().stream().map(f->f.getPanNo()).collect(Collectors.toList());
		System.out.println(lists);
		for(String i : lists) {
			if (i.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}") ||i.length()==10) {
				System.out.println(i +" is Valid");
				} else System.out.println(i +" is invalid");
				}
		}
}
