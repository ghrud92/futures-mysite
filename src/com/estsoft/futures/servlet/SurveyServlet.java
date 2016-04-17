package com.estsoft.futures.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estsoft.futures.web.action.survey.SurveyActionFactory;
import com.estsoft.web.action.Action;
import com.estsoft.web.action.ActionFactory;

@WebServlet("/survey")
public class SurveyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String actionName = request.getParameter("a");
		ActionFactory actionFactory = new SurveyActionFactory();
		
		Action action = actionFactory.getAction(actionName);
		
		action.execute(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
