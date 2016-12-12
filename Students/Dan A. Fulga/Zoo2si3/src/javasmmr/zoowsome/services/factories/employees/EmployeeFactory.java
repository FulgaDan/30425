package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.employees.Employee;

public abstract class EmployeeFactory {
	public abstract Employee getEmployee(String type) throws Exception;
}
