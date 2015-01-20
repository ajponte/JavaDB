package db61b;

import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;


public class RowTests {

	@Test
	public void testRow() {
		Row r1 = new Row(new String[] {"This", "is", "the", "test"});
		Row r2 = new Row(new String[] {"foo", "This", "is", "the", "test"});
		assertEquals(4, r1.size());
		assertEquals(false, r1.equals(r2));
	}
	
}
