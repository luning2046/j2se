<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.sql.DataSource" %>
<html>
 
  <body>
   <% 
   	try { 
			Context context = new InitialContext(); 
			DataSource ds = (DataSource)context.lookup("java:/comp/env/jdbc/mysqlds"); 
			Connection con = ds.getConnection(); 
 
		} catch (NamingException e) { 
			e.printStackTrace(); 
		}catch (SQLException e) { 
			e.printStackTrace(); 
		} 
    %>
  </body>
</html>
