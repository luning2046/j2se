package cys.gh.likeServlet;

public class tomcat {
	//ģ��tomcate��Ӧһ��servlet
	public static void main(String[] args){
		AbstractServlet servlet = new HttpServlet();
		servlet.service("GET");
	}
}
