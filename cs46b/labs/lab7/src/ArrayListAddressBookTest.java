import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListAddressBookTest {
	private AddressBook dir;
	private AddressBook deptDir;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() 
	{
		dir = new ArrayListAddressBook();
		deptDir = new ArrayListAddressBook();
		deptDir.load("deptdir.txt");
		System.out.println(System.getProperty("user.dir"));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void anEmptyDirectoryHasNoFred() 
	{
		assertNull(dir.get("Fred", "Phone"));
	}

	@Test
	public void removeDrHorstmann()
	{
		dir.remove("Horstmann", "Phone");
		assertNull(dir.get("Horstmann", "Phone"));

	}

	@Test
	public void checkEntry()
	{
		dir.put("Jordan", "Phone", "(408) 693-7899");
		if (!dir.get("Jordan", "Phone").equals(""))
		{
			dir.remove("Jordan", "Phone");
		}
	}

	@Test (expected=NoSuchElementException.class)
	public void NoSuchElementTest()
	{
		dir.put("a", "P", "1");
		dir.remove("b", "P");
	}

	@Test
	public void deptDirContainsHorstmann() 
	{
		assertNotNull(deptDir.get("Horstmann", "Phone"));
	}
}
