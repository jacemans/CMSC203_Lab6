import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook grade1;
	private GradeBook grade2;

	@BeforeEach
	void setUp() throws Exception {
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		grade1.addScore(1);
		grade1.addScore(2);
		grade1.addScore(3);
		grade1.addScore(4);
		grade2.addScore(5);
		grade2.addScore(6);
		grade2.addScore(7);
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1 = null;
		grade2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(grade1.toString().equals("1.0 2.0 3.0 4.0 "));
		assertTrue(grade2.toString().equals("5.0 6.0 7.0 "));
	}

	@Test
	void testSum() {
		assertEquals(10.0, grade1.sum(), .0001);
		assertEquals(18, grade2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(1.0, grade1.minimum(), .001);
		assertEquals(5, grade2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(9.0, grade1.finalScore(), .001);
		assertEquals(13.0, grade2.finalScore(), .001);
	}
}
