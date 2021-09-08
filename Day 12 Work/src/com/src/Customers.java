package com.src;

import java.util.Comparator;


class Customers implements Comparable {
	 int id;
	 String name;
	 int money;
	

	public Customers(int id, String name, int money) {
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	

	public Customers() {
		
	}



	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", money=" + money + "]";
	}



	@Override
	public int compareTo(Object o) {
		Customers c=(Customers)o;
		if(c.money>this.money)
		{
			return -1;
		}
		else if(c.money<this.money)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	

}
