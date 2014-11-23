import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.AddressDetail;
import model.EmployeeDetails;

import org.dozer.DozerBeanMapper;

import dto.Employee;

public class Main {
	public static void main(String[] args) {
		System.setProperty("dozer.debug", "true");
		DozerBeanMapper mapper = new DozerBeanMapper();
		List myMappingFiles = new ArrayList();
		myMappingFiles.add("mappings.xml");
		mapper.setMappingFiles(myMappingFiles);

		EmployeeDetails employeeDetails = new EmployeeDetails<String>(2,
				"alex", new AddressDetail(55, "abc road", "700027"), new Date());
		Employee employee = mapper.map(employeeDetails, Employee.class);
		System.out.println(employee);

	}
}
