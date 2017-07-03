package com.mkyong.selenium.mockapplication;


import com.mkyong.selenium.constants.CredentialsType;
import com.mkyong.selenium.constants.Outcome;
import com.mkyong.selenium.mockapplication.view.LoginView;
import com.mkyong.selenium.utils.BrowserDriver;

public class Navigation {
	private User user;

	public void given_I_navigate_to_the_mock_application(){
		BrowserDriver.loadPage("http://localhost:8080/MockApplication.html");
		LoginView.isDisplayedCheck();
	}

	public void when_I_try_to_login(String credentialsType) {
		CredentialsType ct = CredentialsType.credentialsTypeForName(credentialsType);
		switch(ct){
			case VALID:
				user = Users.createValidUser();
			break;
			case INVALID:
				user = Users.createInvalidUser();
			break;
		}
		LoginView.login(user.getUsername(), user.getPassword());
	}
	
	public void then_I_login(String outcomeString){
		Outcome outcome = Outcome.outcomeForName(outcomeString);
		switch(outcome){
			case SUCCESS:
				LoginView.checkLoginSuccess();
			break;
			case FAILURE:
				LoginView.checkLoginErrors();
			break;
		}
	}
}
