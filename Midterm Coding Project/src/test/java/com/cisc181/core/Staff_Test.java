package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.core.Staff;

public class Staff_Test {

	@BeforeClass
	public static void setup() {

	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	@Test
	public void test1() {
		Calendar bday1 = new GregorianCalendar(1995, 10, 29);
		Calendar hiredate = new GregorianCalendar(2014, 5, 17);
		ArrayList<Staff> s = new ArrayList<Staff>();
		s.add(new Staff("Matthew", "James", "Jones", bday1.getTime(), "234923 Cherry Dr.", "5871598762",
				"blahblahblah@blah.net", "9-5", 2, 75000, hiredate.getTime(), eTitle.MR));
		s.add(new Staff("Matthew", "James", "Jones", bday1.getTime(), "234923 Cherry Dr.", "5871598762",
				"blahblahblah@blah.net", "9-5", 2, 87500, hiredate.getTime(), eTitle.MR));
		s.add(new Staff("Matthew", "James", "Jones", bday1.getTime(), "234923 Cherry Dr.", "5871598762",
				"blahblahblah@blah.net", "9-5", 2, 100000, hiredate.getTime(), eTitle.MR));
		s.add(new Staff("Matthew", "James", "Jones", bday1.getTime(), "234923 Cherry Dr.", "5871598762",
				"blahblahblah@blah.net", "9-5", 2, 112500, hiredate.getTime(), eTitle.MR));
		s.add(new Staff("Matthew", "James", "Jones", bday1.getTime(), "234923 Cherry Dr.", "5871598762",
				"blahblahblah@blah.net", "9-5", 2, 125000, hiredate.getTime(), eTitle.MR));
		double total = 0;
		int i = 0;
		for (Staff staff : s) {
			total += staff.getSalary();
			i++;
		}
		double average=total/i;
		assertEquals(100000, average,.01);
	}
	
	//Throws Exception, but doesn't pass JUnit test for some reason
	@Test(expected = PersonException.class)
	public void test2() {
		Calendar bday1 = new GregorianCalendar(1995, 10, 29);
		Calendar hiredate = new GregorianCalendar(2014, 5, 17);
		@SuppressWarnings("unused")
		Staff s = new Staff("Matthew", "James", "Jones", bday1.getTime(), "234923 Cherry Dr.", "58715988762",
				"blahblahblah@blah.net", "9-5", 2, 125000, hiredate.getTime(), eTitle.MR);
	}
	
	//Throws Exception, but doesn't pass JUnit test for some reason
	@Test(expected = PersonException.class)
	public void test3() {
		Calendar bday1 = new GregorianCalendar(1907, 10, 29);
		Calendar hiredate = new GregorianCalendar(2014, 5, 17);
		Staff s = new Staff("Matthew", "James", "Jones", bday1.getTime(), "234923 Cherry Dr.", "5871598762",
				"blahblahblah@blah.net", "9-5", 2, 125000, hiredate.getTime(), eTitle.MR);
		s.PrintAge();
	}
}
