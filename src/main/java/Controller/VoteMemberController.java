package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoteMemberController implements SubController{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {

		String flag = req.getParameter("flag");
		if(flag==null) {
			try {
				req.getRequestDispatcher("/WEB-INF/voteMember.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{


		}

	}
}
