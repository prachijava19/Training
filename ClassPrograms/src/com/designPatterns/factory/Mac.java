package com.designPatterns.factory;

public class Mac implements GUIFactory{

	
	@Override
	public void create() {
		System.out.println("Mac screen created");
		
	}
}
