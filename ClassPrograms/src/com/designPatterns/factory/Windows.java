package com.designPatterns.factory;

public class Windows implements GUIFactory{

	
	@Override
	public void create() {
		System.out.println("Window screen created");
		
	}
}
