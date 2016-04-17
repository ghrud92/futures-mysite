package com.estsoft.futures.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estsoft.web.WebUtil;
import com.estsoft.web.action.Action;

public class DefaultAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		WebUtil.redirect(request, response, "/futures/main");
	}

}
