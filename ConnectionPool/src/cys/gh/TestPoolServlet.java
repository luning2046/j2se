package cys.gh;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class TestPoolServlet extends HttpServlet {


	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("skdfjskafskafskafjksdjfksjfksdfj===============");
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context
					.lookup("java:/comp/env/jdbc/mysqlds");
		
			Connection conn = ds.getConnection();
			System.out.println(conn);
		} catch (NamingException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
