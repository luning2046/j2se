package cys.gh.likeServlet;

public class HttpServlet extends AbstractServlet {

	@Override
	public void doGet(String request, String response) {

		System.out.println("具体的doGet处理");
	}

	@Override
	public void doPost(String request, String response) {
		System.out.println("具体的doPost处理");
	}

}
