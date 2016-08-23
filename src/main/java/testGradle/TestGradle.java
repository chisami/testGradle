package testGradle;

import org.hsqldb.jdbc.JDBCDataSource;

public class TestGradle {


	public static JDBCDataSource dataSource() {
		JDBCDataSource dataSource = new JDBCDataSource();
		dataSource.setUrl("jdbc:hsqldb:file:src/main/resources/db/dvd_library");
		dataSource.setUser("codedata");
		dataSource.setPassword("123456");
		return dataSource;
	}
	
	
	public static void main(String[] args) {
		JDBCDataSource dataSource = TestGradle.dataSource();
		TestDao testDao = new TestDaoImp(dataSource).createTables();
		System.out.println("hello world1");
	}

}
