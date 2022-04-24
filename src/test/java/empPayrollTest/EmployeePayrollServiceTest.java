package empPayrollTest;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import employeeServiceDay27.EmployeePayrollData;
import employeeServiceDay27.EmployeePayrollService;
import employeeServiceDay27.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {

	@Test
	
	public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() {

		
		EmployeePayrollData[] arrayOfEmp = { new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
				new EmployeePayrollData(2, "Bill Gates", 200000.0),
				new EmployeePayrollData(3, "Mark Zuckerberg", 300000.0) };
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));

		
		employeePayrollService.writeEmployeeData(IOService.FILE_IO);

		
		long entries = employeePayrollService.countEntries(IOService.FILE_IO);
		employeePayrollService.printData(IOService.FILE_IO);
		assertEquals(3, entries);
	}
}

