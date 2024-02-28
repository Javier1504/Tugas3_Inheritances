package id.its.pbo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import id.its.pbo.employee.*;

class EmployeeTest {
	Employee employee;
	HourlyEmployee he1, he2;
	CommissionEmployee ce1;
	BasePlusCommission b;
	
	@BeforeEach
	void setUp() {
		employee = new Employee("Elshe", "Angely", 172700);
		he1 = new HourlyEmployee("Elshe", "Angely", 172700, 37, 922.75);
		he2 = new HourlyEmployee("Ingwer", "Ludwig", 172701, 136, 45.25);
		ce1 = new CommissionEmployee("Kyrie", "Irving", 152400, 190.86, 0.64);
		b = new BasePlusCommission("Shaquille", "O'Neal", 152401, 72.18, 0.82, 2.13);
	}
	
	@Test
	@DisplayName("Mendapatkaj input firstname")
	void testInputFirstName() {
		assertEquals("Elshe", employee.getFirstName());
	}
	
	@Test
	@DisplayName("Mendapatkan input lastname")
	void testInputLastName() {
		assertEquals("Angely", employee.getLastName());
	}
	
	@Test
	@DisplayName("Mendapatkan input social security number")
	void testInputSocialSecNumber() {
		assertEquals(172700, employee.getSocialSecurityNumber());
	}
	
	@Test
	@DisplayName("Mendapatkan perolehan gaji kurang dari 40 jam")
	void testEarningLessThan40Hours() {
		assertEquals(34141.75, he1.earnings());
	}
	
	@Test
	@DisplayName("Mendapatkan perolehan gaji dengan waktu lebih dari 40")
	void testEarnings() {
		assertEquals(8326, he2.earnings());
	}
	
	@Test
	@DisplayName("Mendapatkan commission rate")
	void testCommissionEarnings() {
		assertEquals(122.1504, ce1.earnings());
	}
	
	@Test
	@DisplayName("Mendapatkan base plus commission rate")
	void testBasePlus() {
		assertEquals(61.317600000000006, b.earnings());
	}
}
