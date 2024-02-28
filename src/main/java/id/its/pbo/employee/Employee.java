package id.its.pbo.employee;

public class Employee {
	String FirstName, LastName;
	int SocialSecurityNumber;
  public Employee (String FirstName, String LastName, int SocialSecurityNumber){
	  this.FirstName=FirstName;
	  this.LastName=LastName;
	  this.SocialSecurityNumber=SocialSecurityNumber;
  }
  public Employee(){
  
  }
  public String getFirstName (){
	  return FirstName;
  }
  public String getLastName () {
	  return LastName;
  }
  public int getSocialSecurityNumber() {
	  return SocialSecurityNumber;
  }
}