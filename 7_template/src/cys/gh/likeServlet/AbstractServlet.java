package cys.gh.likeServlet;

/*
 * 用模板方法模式  模拟一个Servlet的实现过程
 */
public abstract class AbstractServlet {

	//模拟servlet中HttpRequest,HttpResponse
	public static final String request = "";
	public static final String response = "";
	
	/**
	 * 模板方法，类似HttpServelt中的service方法 
	 */
	public void service(String methodName){
		if(methodName.equals("GET")){
			doGet(request,response);
		}
		if(methodName.equals("POST")){
			doPost(request,response);
		}
	}
	//交由子类完成的方法
	public abstract void doGet(String request,String response);
	public abstract void doPost(String request,String response);
	
}
