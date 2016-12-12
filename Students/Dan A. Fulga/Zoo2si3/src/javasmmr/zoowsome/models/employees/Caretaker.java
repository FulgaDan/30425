package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;

public class Caretaker extends Employee {

	double workingHours;
	
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	public double getWorkingHours(){
		return this.workingHours;
	}
	public Caretaker(String name, int salary, boolean isDead,double workingHours) {
		super(name, salary, isDead);
		this.setID(ID);
		this.setIsDead(isDead);
		this.setName(name);
		this.setSalary(salary);
		this.setWorkingHours(workingHours);
	}
	public Caretaker() {
		
	}
	
	public String takeCareOf(Animal a) {
		if(a.kill()) {
			return Constants.Caretakers.TCO_KILLED;
		}
		else if (this.workingHours < a.getMaintenanceCost()) {
			return Constants.Caretakers.TCO_NO_TIME;
		}
		else {
			a.setTakenCareOf(true);
			this.workingHours = this.workingHours - a.getMaintenanceCost();
			return Constants.Caretakers.TCO_SUCCES;
		}
	}
	
	public boolean getIsDead() {
		return this.isDead;
	}
}
