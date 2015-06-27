package edu.berkeley.cs.cs61b.hw.hw2;

import junit.framework.TestCase;

import org.junit.Test;

public class DateTest extends TestCase {

	private Date date;
	
	public DateTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testIsLeapYear() {
		assertEquals("1995 is not a leap year", Date.isLeapYear(1995), false);
		assertEquals("2012 is a leap year", Date.isLeapYear(2012), true);
		assertEquals("2000 is a leap year", Date.isLeapYear(2000), true);
		assertEquals("2100 is not a leap year", Date.isLeapYear(2100), false);
	}

	@Test
	public void testDaysInMonth() {
		assertEquals("Months in January", 31, Date.daysInMonth(1, 1995));
		assertEquals("Months in February", 28, Date.daysInMonth(2, 1995));
		assertEquals("Months in February", 28, Date.daysInMonth(2, 2001));
		assertEquals("Months in February", 29, Date.daysInMonth(2, 2000));
		assertEquals("Months in February", 29, Date.daysInMonth(2, 2012));
		assertEquals("Months in February", 28, Date.daysInMonth(2, 2100));
		assertEquals("Months in March", 31, Date.daysInMonth(3, 1995));
		assertEquals("Months in April", 30, Date.daysInMonth(4, 1995));
		assertEquals("Months in May", 31, Date.daysInMonth(5, 1995));
		assertEquals("Months in June", 30, Date.daysInMonth(6, 1995));
		assertEquals("Months in July", 31, Date.daysInMonth(7, 1995));
		assertEquals("Months in August", 31, Date.daysInMonth(8, 1995));
		assertEquals("Months in September", 30, Date.daysInMonth(9, 1995));
		assertEquals("Months in October", 31, Date.daysInMonth(10, 1995));
		assertEquals("Months in November", 30, Date.daysInMonth(11, 1995));
		assertEquals("Months in December", 31, Date.daysInMonth(12, 1995));
	}

	@Test
	public void testIsValidDate() {
		assertEquals(true, Date.isValidDate(12, 25, 1995));
		assertEquals(true, Date.isValidDate(7, 1, 2007));
		assertEquals(true, Date.isValidDate(1, 26, 2001));
		assertEquals(true, Date.isValidDate(5, 8, 2012));
		assertEquals(false, Date.isValidDate(13, 12, 1995));
		assertEquals(false, Date.isValidDate(10, 12, -5000));
		assertEquals(false, Date.isValidDate(12, 88, 1995));
		assertEquals(false, Date.isValidDate(2, 30, 2012));
		assertEquals(false, Date.isValidDate(2, 29, 1995));
		assertEquals(false, Date.isValidDate(31, 12, 1995));
	}

	public void testIsValidStringDate(){
		assertEquals(true, Date.isValidDate("12/12/1995"));
		assertEquals(true, Date.isValidDate("07/01/2007"));
		assertEquals(true, Date.isValidDate("1/26/2001"));
		assertEquals(true, Date.isValidDate("05/08/2012"));
		assertEquals(false, Date.isValidDate("13/12/1995"));
		assertEquals(false, Date.isValidDate("10/12/-5000"));
		assertEquals(false, Date.isValidDate("12/88/1995"));
		assertEquals(false, Date.isValidDate("2/30/2012"));
		assertEquals(false, Date.isValidDate("2/29/1995"));
		assertEquals(false, Date.isValidDate("31/12/1995"));
		assertEquals(false, Date.isValidDate("MM/dd/yyyy"));
		assertEquals(false, Date.isValidDate("some/random/test"));
	}

	@Test(expected=Exception.class)
	public void testIsValidStringDateThrowsException(){
		//Date.isValidDate("some big random date text");
	}
	
	@Test
	public void testToString() {
		assertEquals("1/26/2007", new Date(01, 26, 2007).toString());
		assertEquals("1/26/2012", new Date("1/26/2012").toString());
	}

	public void testIsBefore() {
		//fail("Not yet implemented");
	}

	public void testIsAfter() {
		//fail("Not yet implemented");
	}

	public void testDayInYear() {
		assertEquals(26, new Date(1, 26, 2012).dayInYear());
		assertEquals(91, new Date(3, 31, 2012).dayInYear());
		assertEquals(90, new Date(3, 31, 2017).dayInYear());
		assertEquals(366, new Date(12, 31, 2012).dayInYear());
		assertEquals(365, new Date(12, 31, 2017).dayInYear());
	}

	public void testDifference() {
		//fail("Not yet implemented");
	}

}