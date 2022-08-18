package Controller;
		

import java.io.IOException;

import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	
	HashMap<String, SubController> map;
	
	
	@Override
	public void init() throws ServletException {
		map = new HashMap(); // init 에 hashmap 연결하기
		map.put("/main.do", new MainController());
		map.put("/memberList.do", new MemberListController()); // 맴버조회 컨트럴로 만들어서 바로 db로 이동하기
		map.put("/voteMember.do", new VoteMemberController());
		map.put("/voteList.do", null);
		map.put("/votResult.do", null);
		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String url = req.getRequestURI();
		 SubController sub = map.get(url);
		 System.out.println("URL : " + url);
		 sub.execute(req, resp);
	}

	
}
