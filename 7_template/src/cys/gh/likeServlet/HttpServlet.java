package cys.gh.likeServlet;

public class HttpServlet extends AbstractServlet {

	@Override
	public void doGet(String request, String response) {

		System.out.println("�����doGet����");
	}

	@Override
	public void doPost(String request, String response) {
		System.out.println("�����doPost����");
	}

}
