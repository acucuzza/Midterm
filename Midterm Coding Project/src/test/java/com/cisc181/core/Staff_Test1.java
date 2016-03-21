package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.core.Staff;

import com.cisc181.eNums.*;

public class Staff_Test1 {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void AverageSalaryTest() {
		
		ArrayList <Staff> Staff = new ArrayList<Staff>();
		Date d = new Date();
		Staff s1 = new Staff("Jon", "Michael", "Smith", d, "1 Drury Lane", "123-456-7890", "jms@school.edu", "3pm - 4pm", 4, 27000.00, d, eTitle.MR);
		Staff s2 = new Staff("Joe", "John", "Jameson", d, "400 East St", "456-123-6789", "jjj@school.edu", "4pm - 5pm", 3, 43000.00, d, eTitle.MR );
		Staff s3 = new Staff("Donald", "John", "Trump", d, "166 Trump Plaza", "345-567-8901", "djt@school.edu", "9am - 10pm" , 1, 347000.00, d, eTitle.MR );
		Staff s4 = new Staff("Bernie", "Bernie", "Sanders", d, "123 Bernie's House", "567-345-1234", "bbs@school.edu", "6am - 10pm", 2, 20000.00, d, eTitle.MR);
		Staff s5 = new Staff("Hillary", "Hillary", "Clinton", d, "144 Oak St", "542-454-4444", "hhc@school.edu", "8pm - 9pm", 5, 63000.00, d, eTitle.MRS);

		Staff.add(s1);
		Staff.add(s2);
		Staff.add(s3);
		Staff.add(s4);
		Staff.add(s5);
		
		double TestAverageSalary = ((27000.00 + 43000.00 + 347000.00 + 20000.00 + 63000.00) / 5);
		double sum = 0;
		double AverageSalary= 0;
		
		for(int i = 0; i <Staff.size(); i++) {
			sum += Staff.get(i).getSalary();
		}
		
		AverageSalary = sum / Staff.size();
		assertEquals(TestAverageSalary, AverageSalary, TestAverageSalary - AverageSalary);
	}
	
	/*@Test (expected = PersonException.class)
	public void PhoneNumberTest() throws Exception {
	}
	*/
	
	/*@Test (expected = PersonException.class)
	*public void DOBTest() throws Exception{
	}
	*/
}

