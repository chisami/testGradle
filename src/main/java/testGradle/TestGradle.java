package testGradle;

import org.hsqldb.jdbc.JDBCDataSource;

public class TestGradle {


	public static void testDB() {
		JDBCDataSource dataSource = new JDBCDataSource();
		dataSource.setUrl("jdbc:hsqldb:file:src/main/resources/db/dvd_library");
		dataSource.setUser("codedata");
		dataSource.setPassword("123456");
	}
	
	
	public static void main(String[] args) {
		TestGradle.testDB();
		System.out.println("hello world");
	}

}
