package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.controllers.Constants.Employees;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory {

	public Employee getEmployee(String type) {
		if(Constants.Employees.Caretaker.equals(type)){
			return new Caretaker();
		}
		else throw new RuntimeException("runtimeException");
	}

}
