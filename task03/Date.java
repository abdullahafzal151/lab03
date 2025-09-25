public class Date{

	private int day;
	private int month;
	private int year;
	
	
	public Date(int day, int month, int year){
	
	this.day = day;
	this.month = month;
	this.year = year;
		
	}
	//Copy Constructor of date
	public Date(Date d){
		this.day = d.day;
		this.month = d.month;
		this.year = d.year;
	}
	
	void setDay(int day){
		this.day = day;
	}
	void setMonth(int month){
		this.month = month;
	}
	void setYear(int year){
		this.year = year;
	}
	int getDay(){
		return day;
	}
	int getMonth(){
		return month;
	}
	int getYear(){
		return year;
	}
	
	@Override
	public String toString(){
		return String.format("%s-%s-%s", day, month, year);
	}
	
	@Override
	public boolean equals(Object o){
		Date d = (Date)o;
		return d.getYear() == this.year;
	
	}
	




}