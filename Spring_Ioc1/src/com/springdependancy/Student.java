package com.springdependancy;

public class Student {
private int rollno;
private String name;
private Address adr;
public Address getAdr() {
	return adr;
}
public void setAdr(Address adr) {
	this.adr = adr;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
