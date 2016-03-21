package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

import java.util.UUID;
import java.util.Date;

public class Student_Test {
	
	ArrayList <Semester> Semesters = new ArrayList<Semester>();
	ArrayList <Section> Sections =  new ArrayList<Section>();
	ArrayList <Student> Students = new ArrayList<Student>();
	ArrayList <Course> Courses = new ArrayList<Course>();

	@BeforeClass
	public void setup() {
		
		Course Math = new Course(UUID.randomUUID(), "Math", 600, eMajor.COMPSCI);
		Course Chemistry = new Course(UUID.randomUUID(), "Chemistry", 1000, eMajor.CHEM);
		Course Economics = new Course(UUID.randomUUID(), "Economcics", 300, eMajor.BUSINESS);
		
		Courses.add(Math);
		Courses.add(Chemistry);
		Courses.add(Economics);
		
		Date fallDateStart = new Date(2015, Calendar.SEPTEMBER, 1);
		Date fallDateEnd = new Date(2015, Calendar.DECEMBER, 18);		
		Semester Fall = new Semester(UUID.randomUUID(), fallDateStart, fallDateEnd);
		Semesters.add(Fall);
		
		Date springDateStart = new Date(2016, Calendar.FEBRUARY, 8);
		Date springDateEnd = new Date(2016, Calendar.MAY, 25);
		Semester Spring = new Semester(UUID.randomUUID(), springDateStart, springDateEnd);
		Semesters.add(Spring);
		
		Section fallMath = new Section(Math.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 201);
		Section springMath = new Section(Math.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 324);
		Section fallChemistry = new Section(Chemistry.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 001);
		Section springChemistry = new Section(Chemistry.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 123);
		Section fallEconomics = new Section(Economics.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 321);
		Section springEconomics = new Section(Economics.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 456);
		
		Sections.add(fallMath);
		Sections.add(springMath);
		Sections.add(fallChemistry);
		Sections.add(springChemistry);
		Sections.add(fallEconomics);
		Sections.add(springEconomics);
		
		Date s1DOB = new Date(1997, Calendar.JULY, 25);
		Student s1 = new Student("Matthew", "Michael", "Smith", s1DOB, eMajor.COMPSCI, "123 Maple St", "555-236-1237", "mms@school.edu");
		Students.add(s1);
		
		Date s2DOB = new Date(1997, Calendar.JANUARY, 21);
		Student s2 = new Student("Joseph", "Jake", "Fisher", s2DOB, eMajor.NURSING, "1123 South Way", "555-680-4538", "jjf@school.edu");
		Students.add(s2);
		
		Date s3DOB = new Date(1997, Calendar.MARCH, 9);
		Student s3 = new Student("Lisa", "Joann", "Johnson", s3DOB, eMajor.NURSING, "95 Oak Rd", "555-876-1592", "ljj@school.edu");
		Students.add(s3);
		
		Date s4DOB = new Date(1997, Calendar.DECEMBER, 25);
		Student s4 = new Student("Chris", "Phillip", "Cringle", s4DOB, eMajor.BUSINESS, "1 North Pole", "555-547-1438", "cpc@school.edu");
		Students.add(s4);
		
		Date s5DOB = new Date(1997, Calendar.AUGUST, 28);
		Student s5 = new Student("Andrew", "James", "Cucuzza", s5DOB, eMajor.COMPSCI, "165 Street Way", "555-230-4444", "ajc@school.edu");
		Students.add(s5);
		
		Date s6DOB = new Date(1997, Calendar.SEPTEMBER, 12);
		Student s6 = new Student("Daniella", "Joan", "Wu", s6DOB, eMajor.CHEM, "334 Red Court", "555-330-6798", "djw@school.edu");
		Students.add(s6);
		
		Date s7DOB = new Date(1997, Calendar.JUNE, 17);
		Student s7 = new Student("Dean", "Michael", "O'Brien", s7DOB, eMajor.PHYSICS, "324 Shallots Blvd", "555-968-2511", "dmof@school.edu");
		Students.add(s7);
		
		Date s8DOB = new Date(1997, Calendar.OCTOBER, 31);
		Student s8 = new Student("Hall", "O", "Ween", s1DOB, eMajor.BUSINESS, "1 Spooky St", "555-768-9342", "how@school.edu");
		Students.add(s8);
		
		Date s9DOB = new Date(1997, Calendar.MARCH, 27);
		Student s9 = new Student("Eas", "Ter", "Bunny", s9DOB, eMajor.CHEM, "367 Egg Rd", "555-345-1391", "etb@school.edu");
		Students.add(s9);
		
		Date s10DOB = new Date(1997, Calendar.JUNE, 14);
		Student s10 = new Student("Donald", "John", "Trump", s10DOB, eMajor.BUSINESS, "1600 Pennsylvania Ave", "555-222-4447", "djt@school.edu");
		Students.add(s10);
		
	}

	@Test
	public void test() {
	
		for(int i = 0; i < Students.size(); i++) {
			new Enrollment(Sections.get(0).getSectionID(), Students.get(i).getStudentID());
			new Enrollment(Sections.get(1).getSectionID(), Students.get(i).getStudentID());
			
		}
		
		Students.get(2).setMajor(eMajor.CHEM);
		assertEquals(eMajor.CHEM, Students.get(2).getMajor());



	}
}