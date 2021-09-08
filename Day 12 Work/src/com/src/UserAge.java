package com.src;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class UserAge {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String dob=s.nextLine();
		LocalDate d=LocalDate.parse(dob);
		LocalDate current=LocalDate.now();
		System.out.println(Period.between(d, current).getYears()+" years");
		System.out.println(Period.between(d, current).getMonths()+" months");
		System.out.println(Period.between(d, current).getDays()+" days");

	}

}
