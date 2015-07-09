//package cys.gh;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import cys.gh.demo_1.WebPageReader;
//
//public class TestServlet extends HttpServlet {
//
//	
//	public void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		PrintWriter pw = response.getWriter();
//		WebPageReader.connect("http://192.168.11.28:8080/shop/business/QueryMdseType.action?level=3");
//		WebPageReader.readContents();
//		
//	}
//
//	public void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//			this.doGet(request, response);
//	}
//
//
//}
