package getthescreenshot;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateAndTimeScreenShot {
	public static void main(String[] args) {
 	LocalDateTime localDateTime=LocalDateTime.now();
 	System.out.println(localDateTime);
 	LocalDate date=LocalDate.now();
 	LocalTime time=LocalTime.now();
 	String newlocaldatetime= localDateTime.toString().replace(':', '.');
 	System.out.println(date+" Himanshu wrote at "+time);
 	System.out.println(newlocaldatetime);
		
	}

}
