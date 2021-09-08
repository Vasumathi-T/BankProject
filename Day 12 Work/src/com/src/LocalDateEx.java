package com.src;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		//System.out.println(date);
		LocalDate yest=date.minusDays(15);
		//System.out.println(yest);
		LocalDate t=date.minusYears(21);
		//System.out.println(t);
		LocalDate t1=t.minusMonths(5);
		//System.out.println(t1);
		LocalDate t3=t1.plusDays(1);
		System.out.println("My DOB is : " +t3);
		
	}

}
