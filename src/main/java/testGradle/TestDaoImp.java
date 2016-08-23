package testGradle;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class TestDaoImp extends JdbcDaoSupport  implements TestDao{
   
	public TestDaoImp(DataSource dataSource) {
        setDataSource(dataSource);
    }

    public TestDaoImp createTables() {
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
     
        
        return this;
    }

}
