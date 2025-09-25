public class Date{


	private int date;
	private int month;
	private int year;
	
	Date(int date, int month, int year){
		this.date = date;
		this.month = month;
		this.year = year;		
	
	}
	
	void setDate(int date){
	
		this.date = date;
	
	}
	
	void setMonth(int month){
	
		this.month = month;
	}
	
	void setYear(int year){
		this.year = year;
	
	}
	
	int getDate(){
		return date;
	}
	
	int getMonth(){
		return month;
	}
	
	@Override
	public String toString(){
		return String.format("%01d-%01d-%01d", date, month, year);
	
	}






}