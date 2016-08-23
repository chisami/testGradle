package testGradle;

import org.hsqldb.jdbc.JDBCDataSource;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDBConnection {

	@Test()
	public void testConnection() {

		JDBCDataSource dataSource = TestGradle.dataSource();
		TestDao testDao = new TestDaoImp(dataSource).createTables();

		Assert.assertNotNull(testDao);
//		Assert.assertEquals(email, "feedback@yoursite.com");
		Assert.assertNotNull(testDao);
	}
	
}
