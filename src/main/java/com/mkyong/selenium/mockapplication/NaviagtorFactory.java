package com.mkyong.selenium.mockapplication;

public class NaviagtorFactory {
	private static Navigation navigator = null;
	
	public static synchronized Navigation getNavigator(){
		if(navigator == null){
			navigator = new Navigation();
		}
		return navigator;
	}
}
