package com.src;

import java.util.stream.Collectors;
import java.util.*;

public class TreeSetStreamCount {

	public static void main(String[] args) {
		//TreeSet ts=new TreeSet();
		TreeSet ts=new TreeSet(new MyComparator());
		ts.add(new Customers(87,"bubu",9000));
		ts.add(new Customers(78,"dudu",7000));
		ts.add(new Customers(67,"mocha",4000));
		ts.add(new Customers(54,"milk",9500));
		ts.add(new Customers(34,"gomma",3000));
		System.out.println(ts);
		//Object o[]=ts.toArray();
		//System.out.println(o[0]);
		
		//------------
		
		/*List l=(List) ts.stream().filter(o->((Customers)o).money>5000).collect(Collectors.toList());
		System.out.println(l);
		Object o[]=l.toArray();
		System.out.println(o[0]);*/
		
		//-------------
		
		
	}

}
