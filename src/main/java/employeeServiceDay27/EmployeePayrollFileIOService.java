package employeeServiceDay27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollFileIOService {

	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	
	public List<EmployeePayrollData> employeePayrollList;

	
	public EmployeePayrollFileIOService() {
	}

	
	public EmployeePayrollFileIOService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	
	public static void main(String[] args) {

		
		List<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();

		
		EmployeePayrollFileIOService employeePayrollService = new EmployeePayrollFileIOService(employeePayrollList);

		Scanner consoleInputReader = new Scanner(System.in);

		
		employeePayrollService.readEmployeeData(consoleInputReader);

		employeePayrollService.writeEmployeeData(IOService.CONSOLE_IO);
	}

	
	private void writeEmployeeData(IOService consoleIo) {
		
	}


	public void readEmployeeData(Scanner consoleInputReader) {
		System.out.println("Enter employee ID : ");
		int id = Integer.parseInt(consoleInputReader.nextLine());
		System.out.println("Enter employee name : ");
		String name = consoleInputReader.nextLine();
		System.out.println("Enter employee salary : ");
		double salary = Double.parseDouble(consoleInputReader.nextLine());

		
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}

	
	public void writeEmployeeData(List<EmployeePayrollData> employeePayrollList2) {
		if (employeePayrollList2.equals(IOService.CONSOLE_IO))
			System.out.println("Writing Employee Payroll Data to Console\n" + employeePayrollList);
		else if (employeePayrollList2.equals(IOService.FILE_IO))
			new EmployeePayrollFileIOService().writeEmployeeData(employeePayrollList);
	}

	
	public void printData() {
		new EmployeePayrollFileIOService().printData();
	}

	
	public long countEntries() {
		Object ioService = null;
		if (ioService.equals(IOService.FILE_IO))
			return new EmployeePayrollFileIOService().countEntries();
		return 0;
	}


	public void readData(List<EmployeePayrollData> employeePayrollList2) {
	
	}
}