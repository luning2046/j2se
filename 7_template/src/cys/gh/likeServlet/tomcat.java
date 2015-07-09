package cys.gh.likeServlet;

public class tomcat {
	//模拟tomcate响应一个servlet
	public static void main(String[] args){
		AbstractServlet servlet = new HttpServlet();
		servlet.service("GET");
	}
}
