package id.its.pbo.employee;

public class BasePlusCommission extends CommissionEmployee {
	double baseSalary;
	public BasePlusCommission (String FirstName, String LastName, int SocialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
		  this.FirstName=FirstName;
		  this.LastName=LastName;
		  this.SocialSecurityNumber=SocialSecurityNumber;
		  this.grossSales=grossSales;
		  this.commissionRate=commissionRate;
		  this.baseSalary=baseSalary;
	}
	public double earnings() {
		return baseSalary + super.earnings();
	}

}