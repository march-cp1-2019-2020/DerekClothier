
public class MyDate {
	
	private int Month = 06;
	private int Day = 05;
	private int Year = 2003;
	
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	
	String date =
			Month + "/" + 
					Day + "/" +
					Year;

	public String getDate() {
		return date;
	}
	public void setDate(String d) {
		date = d;
	}
	

}
