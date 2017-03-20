package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	// BeforeClass was not working, says that everything in the setup method cannot be resolved, and I don't know how to fix it
	//Still was able to change major of one student on line 53
	@BeforeClass
	public static void setup() {
		ArrayList<Course> c = new ArrayList<Course>();
		c.add(new Course("CISC181", 4, eMajor.COMPSI));
		c.add(new Course("ECON101", 4, eMajor.BUSINESS));
		c.add(new Course("PHYS207", 3, eMajor.PHYSICS));
		ArrayList<Semester> s = new ArrayList<Semester>();
		s.add(new Semester(new GregorianCalendar(2017, 8, 30).getTime(),
				new GregorianCalendar(2017, 12, 17).getTime()));
		s.add(new Semester(new GregorianCalendar(2018, 2, 8).getTime(), new GregorianCalendar(2018, 5, 17).getTime()));
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student("Matthew", "James", "Jones", new GregorianCalendar(1995, 10, 29).getTime(), eMajor.PHYSICS,
				"23048320 Cherry Ln.", "5826842886", "askdl@asd.ekd"));
		st.add(new Student("Matthew", "James", "Jones", new GregorianCalendar(1995, 10, 29).getTime(), eMajor.PHYSICS,
				"23048320 Cherry Ln.", "5826842886", "askdl@asd.ekd"));
		st.add(new Student("Matthew", "James", "Jones", new GregorianCalendar(1995, 10, 29).getTime(), eMajor.PHYSICS,
				"23048320 Cherry Ln.", "5826842886", "askdl@asd.ekd"));
		st.add(new Student("Matthew", "James", "Jones", new GregorianCalendar(1995, 10, 29).getTime(), eMajor.PHYSICS,
				"23048320 Cherry Ln.", "5826842886", "askdl@asd.ekd"));
		st.add(new Student("Matthew", "James", "Jones", new GregorianCalendar(1995, 10, 29).getTime(), eMajor.PHYSICS,
				"23048320 Cherry Ln.", "5826842886", "askdl@asd.ekd"));
		st.add(new Student("Matthew", "James", "Jones", new GregorianCalendar(1995, 10, 29).getTime(), eMajor.PHYSICS,
				"23048320 Cherry Ln.", "5826842886", "askdl@asd.ekd"));
		st.add(new Student("Matthew", "James", "Jones", new GregorianCalendar(1995, 10, 29).getTime(), eMajor.PHYSICS,
				"23048320 Cherry Ln.", "5826842886", "askdl@asd.ekd"));
		st.add(new Student("Matthew", "James", "Jones", new GregorianCalendar(1995, 10, 29).getTime(), eMajor.PHYSICS,
				"23048320 Cherry Ln.", "5826842886", "askdl@asd.ekd"));
		st.add(new Student("Matthew", "James", "Jones", new GregorianCalendar(1995, 10, 29).getTime(), eMajor.PHYSICS,
				"23048320 Cherry Ln.", "5826842886", "askdl@asd.ekd"));
		st.add(new Student("Matthew", "James", "Jones", new GregorianCalendar(1995, 10, 29).getTime(), eMajor.PHYSICS,
				"23048320 Cherry Ln.", "5826842886", "askdl@asd.ekd"));
		//Changing Major of first student:
		st.get(0).setMajor(eMajor.CHEM);
		ArrayList<Enrollment> CF = new ArrayList<Enrollment>();
		ArrayList<Enrollment> CS = new ArrayList<Enrollment>();
		ArrayList<Enrollment> EF = new ArrayList<Enrollment>();
		ArrayList<Enrollment> ES = new ArrayList<Enrollment>();
		ArrayList<Enrollment> PF = new ArrayList<Enrollment>();
		ArrayList<Enrollment> PS = new ArrayList<Enrollment>();
		ArrayList<Section> sc = new ArrayList<Section>();
		sc.add(new Section(c.get(0).getCourseID(), s.get(0).getSemesterID(), 12));
		sc.add(new Section(c.get(1).getCourseID(), s.get(0).getSemesterID(), 12));
		sc.add(new Section(c.get(2).getCourseID(), s.get(0).getSemesterID(), 12));
		sc.add(new Section(c.get(0).getCourseID(), s.get(1).getSemesterID(), 12));
		sc.add(new Section(c.get(1).getCourseID(), s.get(1).getSemesterID(), 12));
		sc.add(new Section(c.get(2).getCourseID(), s.get(1).getSemesterID(), 12));
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	@Test
	public void test1() {
		ArrayList<Integer> g1 = new ArrayList<Integer>();
		g1.addAll(Arrays.asList(92, 85, 73, 94, 63, 46, 75, 89, 98, 87));
		ArrayList<Integer> g2 = new ArrayList<Integer>();
		g2.addAll(Arrays.asList(83, 65, 82, 95, 65, 98, 89, 70, 90, 77));
		ArrayList<Integer> g3 = new ArrayList<Integer>();
		g3.addAll(Arrays.asList(100, 74, 79, 84, 91, 78, 90, 85, 91, 67));
		int counter = 0;
		for (Student student : st) {
			CF.add(new Enrollment(st.get(counter).getStudentID(), sc.get(0).getSectionID()));
			CS.add(new Enrollment(st.get(counter).getStudentID(), sc.get(1).getSectionID()));
			EF.add(new Enrollment(st.get(counter).getStudentID(), sc.get(2).getSectionID()));
			ES.add(new Enrollment(st.get(counter).getStudentID(), sc.get(3).getSectionID()));
			PF.add(new Enrollment(st.get(counter).getStudentID(), sc.get(4).getSectionID()));
			PS.add(new Enrollment(st.get(counter).getStudentID(), sc.get(5).getSectionID()));

			CF.get(counter).setGrade(g1.get(counter));
			CS.get(counter).setGrade(g1.get(counter));
			EF.get(counter).setGrade(g1.get(counter));
			ES.get(counter).setGrade(g1.get(counter));
			PF.get(counter).setGrade(g1.get(counter));
			PS.get(counter).setGrade(g1.get(counter));

			counter += 1;
		}
		
	}
}