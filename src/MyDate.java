import java.sql.Date;
import java.util.GregorianCalendar;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate (int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

	public void setDay(int d) {
		day = d;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setYear(int y) {
		year = y;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public boolean isLeapYear() 
	{
		 int y =this.year;
		if(y%4 == 0 && y%100 != 0  || y%400 == 0 ) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
	public int daysInMonth(){
		int days = 0;
		
		int[] intArray = new int[4];
		intArray[0] = 30;
		intArray[1] = 31;
		intArray[2] = 28;
		intArray[3] = 29;
		
		int i = month;
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				days = intArray[1];
			} else if(i == 4 || i == 6 || i == 9 || i == 11) {
				days = intArray[0];
			} else if (i == 2) {
				if(isLeapYear()) {
					days = intArray[3];
				} else {
					days = intArray[2];
				}
			} else {
				days = 0;
		}
		return days;
		}
	
	public String getAstroSign() {
		String sign = "";
		if(month == 1) 
		{
			if(day <= 19 && day > 0) {
				sign = "Capricon";
			} else if(day > 19 && day <= 31) {
				sign = "Aquarius";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 2)
		{
			if(day <= 18 && day > 0) {
				sign = "Aquarius";
			} else if(day >= 19 && day <= 29) {
				sign = "Pisces";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 3) 
		{
			if(day <= 20 && day > 0) {
				sign = "Pisces";
			} else if(day >=21 && day < 31) {
				sign = "Aries";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 4) {
			if(day <= 19 && day > 0) {
				sign = "Aries";
			} else if(day >= 20 && day < 30) {
				sign = "Taurus";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 5) 
		{
			if(day <= 20 && day > 0) {
				sign = "Taurus";
			} else if(day >=21 && day < 31) {
				sign = "Gemini";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 6) {
			if(day <= 20 && day > 0) {
				sign = "Gemini";
			} else if(day >= 21 && day < 30) {
				sign = "Cancer";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 7) 
		{
			if(day <= 22 && day > 0) {
				sign = "Cancer";
			} else if(day >=23 && day < 31) {
				sign = "Leo";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 8) {
			if(day <= 22 && day > 0) {
				sign = "Leo";
			} else if(day >= 23 && day < 31) {
				sign = "Virgo";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 9) 
		{
			if(day <= 22 && day > 0) {
				sign = "Virgo";
			} else if(day >=23 && day < 31) {
				sign = "Libra";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 10) {
			if(day <= 22 && day > 0) {
				sign = "Libra";
			} else if(day >= 23 && day < 30) {
				sign = "Scorpio";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 11) 
		{
			if(day <= 21 && day > 0) {
				sign = "Scorpio";
			} else if(day >=22 && day < 31) {
				sign = "Sagittarius";
			} else {
				sign = "Enter a valid day!";
			}
		}
		if(month == 12) {
			if(day <= 21 && day > 0) {
				sign = "Sagittarius";
			} else if(day >= 22 && day < 30) {
				sign = "Capricon";
			} else {
				sign = "Enter a valid day!";
			}
		}
		return sign;
	}
	
	public String dayOfWeek() {
		String[] days = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";		
		int h = 0;
		int q = day;
		int m = month;
//		int yearSub = year;
			if(m == 1) 
			{
				m = 13;
//				yearSub =- 1;
			}else if(m == 2) 
			{
				m = 14;
//				yearSub =-1;
			}
		int k = (year-1)%100;	
		int j = (year-1)/100;
		
		h = (q + ((13*(m+1))/5) + k + (k/4) + (j/4) + 5 * j)%7 ;
		
		String dayOfWeek= "";
		if(h == 0)
		{
			dayOfWeek = days[5];
		} else if(h == 1) 
		{
			dayOfWeek = days[6];
		} else if(h == 2) 
		{
			dayOfWeek = days[0];
		} else if(h == 3)
		{
			dayOfWeek = days[1];
		} else if (h==4) 
		{
			dayOfWeek = days[2];
		}
		else if(h == 5) 
		{
			dayOfWeek = days[3];
		} 
		else if(h == 6) 
		{
			dayOfWeek = days[4];
		}
		
		
		
		return dayOfWeek;
	}
	
	public static MyDate today() 
	{
		GregorianCalendar current = new GregorianCalendar();
		int day = current.get(GregorianCalendar.DATE);
		int month = current.get(GregorianCalendar.MONTH) +1;
		int year = current.get(GregorianCalendar.YEAR);
		return new MyDate(day, month, year);	
	}
	
	public String getMonthName() {
		switch(month)
		{
		case 1 : return "January";
		case 2 : return "February";
		case 3 : return "March";
		case 4 : return "April";
		case 5 : return "May";
		case 6 : return "June";
		case 7 : return "July";
		case 8 : return "August";
		case 9 : return "September";
		case 10 : return "October";
		case 11 : return "November";
		case 12 : return "December";
		default : return "Error";
		}
	}
	
	public void lama() {
		if(year == 1999) {
			System.out.println("It's lama year!!!");
		}
	}
	public void nextDay() {	
		day++;
		
		if(day>daysInMonth())
		{
			day =1;
			month++;
			if(month > 12) {
				month = 1;
				year++;
			}
		}
		
	}
	
	public String toString() {
		return "Day: " + day + " Month: " + month + " Year: " + year;
	}
}
	

