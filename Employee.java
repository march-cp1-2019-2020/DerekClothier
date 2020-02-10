
public class Employee extends Person {
	
	//Derek Clothier
	
	private String Office;
	
	public String getOffice() {
		return Office;
	}
	public void setOffice(String office) {
		Office = office;
	}
	
	private String Salary;
	
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	
	private MyDate dateHired = new MyDate();

	public MyDate getDateHired() {
		System.out.println(dateHired.getDate());
		return dateHired;
	}
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	
	
	
	

}
