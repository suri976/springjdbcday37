package ai.jobiak.dao;
import org.springframework.jdbc.core.JdbcTemplate;  
public class CustomerDAO {

	//performs CURD operations with customer table 	
	private JdbcTemplate mysqlTemplate;

	public JdbcTemplate getMysqlTEmplate() {
		return mysqlTemplate;
	}

	public void setMysqlTEmplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate = mysqlTemplate;
	}
	
	public int insertRow()
	{
		return mysqlTemplate.update("insert into customer values (199,'Michell lee',4000)");
		
	}
	
	
}
