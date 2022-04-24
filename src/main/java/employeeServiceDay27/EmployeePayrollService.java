package employeeServiceDay27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {


	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	
	private List<EmployeePayrollData> employeePayrollList;

	
	public EmployeePayrollService() {
	}

	
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	
	public static void main(String[] args) {
		
		List<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();

		/**
		 * creating instance of EmployeePayrollData class
		 */
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);

		/**
		 * using scanner to read input from console
		 */
		Scanner consoleInputReader = new Scanner(System.in);

		/**
		 * Calling method readEmployeeData to read data from console
		 */
		employeePayrollService.readEmployeeData(consoleInputReader);

		/**
		 * Calling method writeEmployeePayrollData to write the data
		 */
		employeePayrollService.writeEmployeeData();
	}

	/**
	 * consoleInputReader Read employee data
	 */
	private void readEmployeeData(Scanner consoleInputReader) {
		System.out.println("Enter employee ID : ");
		int id = Integer.parseInt(consoleInputReader.nextLine());
		System.out.println("Enter employee name : ");
		String name = consoleInputReader.nextLine();
		System.out.println("Enter employee salary : ");
		double salary = Double.parseDouble(consoleInputReader.nextLine());

		/**
		 * Adding EmployeePayrollData to the employeepayrollList
		 */
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}

	/**
	 * created method writeEmployeeData which writes the data of the employee in the
	 * console
	 */
	private void writeEmployeeData() {
		System.out.println("Writing Employee Payroll Data to Console\n" + employeePayrollList);
	}
}
