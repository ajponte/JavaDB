package db61b;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTests {

	@Test
	public void testTable() {
		System.out.println("TESTING TABLE CREATION");
		String[] colTitles1 = {"Test1", "Test2", "Test3"};
		Row r1 = new Row(new String[] {"val1", "val2", "val3"});
		Row r2 = new Row(new String[] {"val4", "val5", "val6"});
		Table t1 = new Table(colTitles1);
		t1.add(r1);
		t1.add(r2);
		t1.print();
		assertEquals("Test1", t1.getTitle(0));
	}

}
