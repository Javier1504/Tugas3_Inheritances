package id.its.pbo.employee;

public class HourlyEmployee extends Employee {
	double hours;
	double wage;
	public HourlyEmployee (String FirstName, String LastName, int SocialSecurityNumber, double hours, double wage){
		super(FirstName, LastName, SocialSecurityNumber);
		if(hours >= 0.0 && hours < 168) {
			this.hours = hours;
		} else {
			this.hours = 0.0;
		}
		this.wage = wage;
		
	  }
	public double earnings(){
		if (hours <= 40)
			return hours * wage;
		else
			return 40 * wage + (hours-40)* wage * 1.5;
	}
}