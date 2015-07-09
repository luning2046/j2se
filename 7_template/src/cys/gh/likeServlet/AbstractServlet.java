package cys.gh.likeServlet;

/*
 * ��ģ�巽��ģʽ  ģ��һ��Servlet��ʵ�ֹ���
 */
public abstract class AbstractServlet {

	//ģ��servlet��HttpRequest,HttpResponse
	public static final String request = "";
	public static final String response = "";
	
	/**
	 * ģ�巽��������HttpServelt�е�service���� 
	 */
	public void service(String methodName){
		if(methodName.equals("GET")){
			doGet(request,response);
		}
		if(methodName.equals("POST")){
			doPost(request,response);
		}
	}
	//����������ɵķ���
	public abstract void doGet(String request,String response);
	public abstract void doPost(String request,String response);
	
}
