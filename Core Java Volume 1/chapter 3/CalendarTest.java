import java.text.DateFormatSymbols;
import java.util.*;

/**
  *@version 1.0
  *@author Colin
  *@date 2016-04-12
  */

public class CalendarTest{
	public static void main(String[] args){
		GregorianCalendar d = new GregorianCalendar();
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = d.get(Calendar.DAY_OF_WEEK);
	}
}