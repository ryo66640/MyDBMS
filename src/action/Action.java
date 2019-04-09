package action;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.Dao;
import dao.ProductDAO;

public interface Action {
	public abstract String execute(HttpServletRequest request, HttpServletResponse reponse) throws NamingException, SQLException, UnsupportedEncodingException;
}