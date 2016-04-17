package com.estsoft.futures.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.estsoft.db.MySQLWebDBConnection;
import com.estsoft.futures.dao.UserDao;
import com.estsoft.futures.vo.UserVo;
import com.estsoft.web.WebUtil;
import com.estsoft.web.action.Action;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserVo vo = new UserVo();
		vo.setEmail(email);
		vo.setPassword(password);
		
		UserVo authUser = new UserDao(new MySQLWebDBConnection()).get(vo);
		
		if(authUser == null){
			// 로그인 실패
			WebUtil.forward(request, response, "WEB-INF/views/user/loginform.jsp?result=f");
			return;
		}
		
		// 인증 성공(로그인처리)
		HttpSession session = request.getSession(true);
		session.setAttribute("authUser", authUser);

		WebUtil.redirect(request, response, "/futures/main");
	}

}
