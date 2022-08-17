package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.VoteDAO;
import DTO.MemberDTO;
import DTO.PartyDTO;

public class MemberListController implements SubController{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		 
		VoteDAO dao = new VoteDAO();
		// 파라미터 X
		// 입력값 X
		
		// 서비스 ->DAO
		ArrayList<MemberDTO> mlist = dao.getMemberList();
		ArrayList<PartyDTO> plist = dao.getPartyList();
		// VIEW 
		
		req.setAttribute("mlist", mlist);
		req.setAttribute("plist", plist);
		
		try {
			req.getRequestDispatcher("/WEB-INF/memberList.jsp").forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
