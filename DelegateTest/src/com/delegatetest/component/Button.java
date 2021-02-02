package com.delegatetest.component;

import com.delegatetest.action.ClickListener;

public class Button {
	private ClickListener listener;
	
	public void click() {
		this.listener.doPress();
	}
	
	public void setListener(ClickListener listener) {
		this.listener=listener;
	}
	

}
