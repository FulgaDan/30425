package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import javax.xml.stream.XMLEventWriter;

public abstract class Employee {
	
	String name;
	long  ID;
	int salary;
	boolean isDead = false;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setSalary(int salary2) {
		this.salary = salary2;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public static long ID_gen() {
	    while (true) {
	        long ID = (long)(Math.random() * 100000000 * 1000000);
	        if (String.valueOf(ID).length() == 13)
	            return ID;
	    }
	}
	public void setID(long ID) {
		this.ID = ID_gen();
	}
	
	public long getID(){
		return this.ID;
	}
	
	public boolean isDead(boolean isDead) {
		if(isDead) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
	public boolean isDead() {
		return this.isDead;
	}
	
	public Employee(String name, int salary, boolean isDead) {
		this.setName(name);
		this.setSalary(salary);
		this.setID(ID);
		this.setIsDead(isDead);
	}
	
	public Employee() {
		
	}

}
