package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class StudentEx {

	public static void main(String[] args) {
		PriorityQueue<Student> pq=new PriorityQueue();
		pq.add(new Student(1,"Vasumathi","TN",85,89,98));
		pq.add(new Student(2,"Ammu","TN",89,79,90));
		pq.add(new Student(3,"Aks","AP",81,90,76));
		pq.add(new Student(4,"Jaswant","TN",97,91,85));
		pq.add(new Student(5,"Vishal","TN",86,84,95));
		pq.add(new Student(6,"Naz","KL",72,67,89));
		pq.add(new Student(7,"Arun","KA",85,66,79));
		pq.add(new Student(8,"Kavi","UK",47,66,69));
		pq.add(new Student(9,"Kapoor","MP",90,66,59));
		Student c=pq.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(c);
		List<Student> l=pq.stream().sorted((i1,i2)->((Student)i1).name.length()>((Student)i2).name.length()?-1:1).collect(Collectors.toList());
		System.out.println(l);
		List<Student> l1=pq.stream().sorted((i1,i2)->((Student)i1).total/3>((Student)i2).total/3?-1:1).collect(Collectors.toList());
		System.out.println(l1);
	}
}
class Student implements Comparable
{
	int id;
	String name;
	String address;
	int math;int sci;
	int soc;
	int total;
	public Student(int id,String name,String address,int math,int sci,int soc)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.math=math;
		this.sci=sci;
		this.soc=soc;
		int val=(math+sci+soc);
		this.total=val;
	}
	public String toString()
	{
		return id+" "+name+" "+address;
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		if(s.total>this.total||(s.total==this.total&&s.math>this.math)) {
			return -1;
		}
		else {
			return 1;
		}

	}

}
