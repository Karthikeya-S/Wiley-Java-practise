package wiley_core_java;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {
	public static void main(String[] args) {
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);
		
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
		
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Before format: "+myDateTime);
		
		DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");
		String modDateTime = myDateTime.format(myDateFormat);
		System.out.println("After Format: "+modDateTime);
		
		
		LocalDateTime ldt = LocalDateTime.of(2023, 8, 9, 20, 05, 35);
		DateTimeFormatter news = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:MM:SS");
		String newone = ldt.format(news);
		System.out.println(newone);
		
		LocalDateTime ldt1 = LocalDateTime.now();
		DateTimeFormatter newone1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:MM:ss");
		String newformat = ldt1.format(newone1);
		System.out.println(newformat);
		
		DateTimeFormatter newF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String str = "21/05/2023";
		LocalDate date = LocalDate.parse(str, newF);
		System.out.println(date);
	}
}
