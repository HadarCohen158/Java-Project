package data;

import java.io.Serializable;
import java.util.Scanner;

public class Worker implements Serializable{
	
	private int age;
	private double salary;
	private String name;
	private long workerId;
	
	public Worker(){
		
	}
	
	public Worker(int age, double salary, String name, long workerId) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.workerId = workerId;
	}
	
	public Worker(String line){
		this.toWorker(line);
	}
	
	public int hashCode(){
		//return (int) (this.workerId*this.name.hashCode()*this.salary*this.age);
		return (int)this.workerId;
	}
	
	public boolean equals(Object obj){
		if(obj==null) return false;
		
		if(this==obj) return true;
		
		if(!(obj instanceof Worker)) 
			return false;
		
		Worker other = (Worker)obj;
		return this.workerId == other.workerId;
	}
	
	
	public String toString(){
		return "WorkerInformation: "+this.name+" "+this.age+" "+this.salary+ " "+this.workerId;
	}
	
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getWorkerId() {
		return workerId;
	}
	public void setWorkerId(long workerId) {
		this.workerId = workerId;
	}
	
	public void toWorker(String line){
		Scanner s = new Scanner(line);
		s.useDelimiter(" ");
		String intro = s.next();
		this.name = s.next();
		this.age = s.nextInt();
		this.salary = s.nextDouble();
		this.workerId = s.nextLong();
	}

}
