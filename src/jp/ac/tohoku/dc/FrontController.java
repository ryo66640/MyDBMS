package jp.ac.tohoku.dc;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;

@WebServlet(urlPatterns= {"*.action"})
public class FrontController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String packageName = "action.";
		String path = request.getServletPath().substring(5).replace(".a", "A").replace("/", ".");
		String className = packageName + path;
		try {
			Action action = (Action) Class.forName(className).newInstance();
			String urlJSP;
			urlJSP = action.execute(request, response);
			request.getRequestDispatcher(urlJSP).forward(request, response);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
				| NamingException | SQLException e) {
			e.printStackTrace();
		}
	}
}
