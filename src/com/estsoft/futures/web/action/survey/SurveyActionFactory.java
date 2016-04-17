package com.estsoft.futures.web.action.survey;

import com.estsoft.web.action.Action;
import com.estsoft.web.action.ActionFactory;

public class SurveyActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		System.out.println("in ServeyActionFactory");
		Action action = null;
		if("add".equals(actionName)){
			
		}else{
			action = new DefaultAction();
		}
		return action;
	}

}
