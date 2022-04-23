package employeeServiceDay27;

public class EmployeePayrollData {

	/**
	 * creating variables
	 */
	public int id;
	public String name;
	public double salary;

	/**
	 * creating parameterized constructor of EmployeePayrollData by passing
	 * parameters with no return type
	 * 
	 * @param id     -passing employee Id
	 * @param name   -passing employee name
	 * @param salary -passing employee salary
	 */
	public EmployeePayrollData(int id, String name, double salary) {

		/**
		 * this Keyword is used to point the current object
		 */
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	/**
	 * The toString() method returns the String representation of the object.
	 */
	public String toString() {
		return "id =" + id + ",name =" + name + ",salary =" + salary;
	}
}