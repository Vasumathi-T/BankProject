package com.src;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Customers c1=(Customers)o1;
		Customers c2=(Customers)o2;
		if(c1.money>c2.money)
		{
			return -1;
		}
		else if(c1.money<c2.money)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}

}
