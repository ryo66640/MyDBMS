package action;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.Dao;
import dao.ProductDAO;

public class SearchAction implements Action{
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws NamingException, SQLException{
		String keyword = request.getParameter("keyword");
		
		Dao dao = new ProductDAO();
		List<Product> list;
		list = dao.search(keyword);
		request.setAttribute("products", list);

		return "/jsp/search-result.jsp";
	}

}
