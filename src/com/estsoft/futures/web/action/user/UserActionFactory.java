package com.estsoft.futures.web.action.user;

import com.estsoft.web.action.Action;
import com.estsoft.web.action.ActionFactory;

public class UserActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		
		if("joinform".equals(actionName)){
			action = new JoinFormAction();
		}else if("join".equals(actionName)){
			action = new JoinAction();
		}else if("loginform".equals(actionName)){
			action = new LoginFormAction();
		}else if("login".equals(actionName)){
			action = new LoginAction();
		}else if("modifyform".equals(actionName)){
			
		}else if("modify".equals(actionName)){
			
		}else if("logout".equals(actionName)){
			action = new LogoutAction();
		}else{
			action = new DefaultAction();
		}
		
		return action;
	}

}
