package com.estsoft.futures.web.action.main;

import com.estsoft.web.action.Action;
import com.estsoft.web.action.ActionFactory;

public class MainActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		System.out.println("in MainActionFactory");
		Action action = new DefaultAction();
		
		return action;
	}

}
