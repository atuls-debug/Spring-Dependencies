package com.atulspring;


import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

 
public class Employee2 {
private int id;
private String name;
private int basic;
private int hra;
private int da;
private int deductions;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBasic() {
	return basic;
}
public void setBasic(int basic) {
	this.basic = basic;
}
public int getHra() {
	return hra;
}
public void setHra(int hra) {
	this.hra = hra;
}
public int getDa() {
	return da;
}
public void setDa(int da) {
	this.da = da;
}
public int getDeductions() {
	return deductions;
}
public void setDeductions(int deductions) {
	this.deductions = deductions;
}
 


}
