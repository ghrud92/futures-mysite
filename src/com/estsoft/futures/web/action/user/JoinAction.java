package com.estsoft.futures.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estsoft.db.MySQLWebDBConnection;
import com.estsoft.futures.dao.UserDao;
import com.estsoft.futures.vo.UserVo;
import com.estsoft.web.WebUtil;
import com.estsoft.web.action.Action;

public class JoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserVo vo = new UserVo();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		vo.setName(name);
		vo.setEmail(email);
		vo.setPassword(password);
		
		new UserDao(new MySQLWebDBConnection()).insert(vo);
		
		WebUtil.redirect(request, response, "/futures/main");
	}

}
