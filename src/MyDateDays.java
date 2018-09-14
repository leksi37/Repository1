import java.util.*;
public class MyDateDays 
{
	public static void main(String[] args) 
	{
		MyDate birthday = new MyDate(12, 2 ,1999);
		MyDate currentDate = new MyDate().today();
		MyDate daysPassed = new MyDate(0, 0, 0);
		int days = 0;
		
		for(int i = 0;birthday.getYear() < currentDate.getYear() || birthday.getMonth() < currentDate.getMonth() || birthday.getDay() < currentDate.getDay();i++) 
		{

			days = i;
			birthday.nextDay();
			
		}

		System.out.println(days+1);
		System.out.println(" days have passed..");
	}
}
