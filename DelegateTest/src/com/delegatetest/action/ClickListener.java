package com.delegatetest.action;

public abstract class ClickListener extends Listener {
	protected abstract void press() ;
	
	public void doPress() {
		this.press();
	}
}
