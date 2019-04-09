package action;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.Dao;
import dao.ProductDAO;

public class InsertAction implements Action{
	public String execute(HttpServletRequest request, HttpServletResponse response) throws NamingException, SQLException, UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		
		Product p = new Product();
		p.setName(name);
		p.setPrice(price);		
		Dao dao = new ProductDAO();
		int line = dao.insert(p);
		
		if(line < 0) {
			return "/jsp/insert-error.jsp";
		}
			
		return "/jsp/insert-success.jsp";
	}

}
