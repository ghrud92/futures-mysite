package com.estsoft.futures.web.action.survey;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estsoft.db.MySQLWebDBConnection;
import com.estsoft.futures.dao.RestaurantDao;
import com.estsoft.futures.vo.RestaurantVo;
import com.estsoft.web.WebUtil;
import com.estsoft.web.action.Action;

public class DefaultAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("survey DefaultAction execute");
		List<RestaurantVo> list = new RestaurantDao(new MySQLWebDBConnection()).getList();
		
		request.setAttribute("list", list);
		
		WebUtil.forward(request, response, "WEB-INF/views/survey/list.jsp");
	}

}
