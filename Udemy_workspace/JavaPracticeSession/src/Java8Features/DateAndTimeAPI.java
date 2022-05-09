package Java8Features;

import java.time.*;
public class DateAndTimeAPI {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
			
		System.out.println(date);
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		
		System.out.printf("\n%d-%d-%d", dd,mm,yyyy);
		
		LocalTime time = LocalTime.now();		
		
		System.out.println(time);
		
		int hh=time.getHour();
		int m=time.getMinute();
		int ss=time.getSecond();
		int ns=time.getNano();
		
		System.out.printf("\n%d:%d:%d:%d", hh, m, ss, ns);
		
		System.out.println();
		
		// we can get both date and time by using LocalDateTime.
		
		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local);
		
		LocalDateTime local1 = LocalDateTime.of(1995,Month.JUNE, 04, 11, 25);
		
		System.out.println(local1);
		
		System.out.println("Six month after " + local1.plusMonths(6));
		
		System.out.println("Six month before " + local1.minusMonths(6));
		
		
		// How to calculate your birthday
		
		LocalDate birthday = LocalDate.of(1994, Month.JUNE, 05);
		LocalDate cuurentDate = LocalDate.now();
		
		Period p = Period.between(birthday, cuurentDate);
		
		System.out.printf("Your Age is %d Years %d Months %d Days", p.getYears(), p.getMonths(), p.getDays());

	}

}
