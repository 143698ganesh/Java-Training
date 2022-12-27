package EmployeeSort;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import functionalInterface.EmployeeDao;
import functionalInterface.EmployeeModel;

public class EmployeeService {

	public static void main(String[] args) {
		List<EmployeeModel> list = new EmployeeDao().getModels();
		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {

			if (list.get(i).getId() > list.get(j).getId()) {

				EmployeeModel tmp = list.get(i);

			list.set(i, list.get(j));

			list.set(j, tmp);

			}

			}

			}

			System.out.println(list);

			}
}
