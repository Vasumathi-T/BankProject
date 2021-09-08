package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerStreamEx {

	public static void main(String[] args) {
		ArrayList<Customers> al=new ArrayList<Customers>();
		al.add(new Customers(56,"vas",8000));
		al.add(new Customers(98,"jas",7000));
		al.add(new Customers(76,"vishal",3000));
		al.add(new Customers(90,"aruna",2000));
		al.add(new Customers(34,"thiru",9000));
		
		/*List<Customers> res=al.stream().filter(o->((Customers)o).money>5000).collect(Collectors.toList());
		System.out.println(res);
		Object o[]=res.toArray();
		System.out.println(o[0]);*/
		long result=al.stream().filter(o->o.money>5000).count();
		System.out.println(result);
		Customers l=al.stream().max((o1,o2)->o1.compareTo(o2)).get();
		System.out.println(l);
	}

}

