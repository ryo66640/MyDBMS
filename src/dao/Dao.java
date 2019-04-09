package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import bean.Product;

public abstract class Dao {
	static DataSource ds;
	
	public Connection getConnection() throws NamingException, SQLException{
		if(ds == null) {
			InitialContext ic;
				ic = new InitialContext();
				ds = (DataSource)ic.lookup("java:comp/env/jdbc/sample");
		}
			return ds.getConnection();
	}
	
	public abstract List<Product> search(String keyword) throws NamingException, SQLException;
	public abstract int insert(Product product) throws NamingException, SQLException;
	
}
