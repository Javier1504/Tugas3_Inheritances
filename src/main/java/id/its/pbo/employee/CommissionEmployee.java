package id.its.pbo.employee;

public class CommissionEmployee extends Employee {
	double grossSales, commissionRate;
	public CommissionEmployee (String FirstName, String LastName, int SocialSecurityNumber, double grossSales, double commissionRate){
		  this.FirstName=FirstName;
		  this.LastName=LastName;
		  this.SocialSecurityNumber=SocialSecurityNumber;
		  this.grossSales=grossSales;
		  this.commissionRate=commissionRate;
	}
	public double earnings() {
		return commissionRate * grossSales;
		
	}
	public CommissionEmployee () {
		
	}
}