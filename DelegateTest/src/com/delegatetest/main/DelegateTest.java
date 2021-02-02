package com.delegatetest.main;

import com.delegatetest.action.ClickListener;
import com.delegatetest.component.Button;
import com.delegatetest.component.Text;

public class DelegateTest {

	public static void main(String[] args) {
		DelegateTest dt = new DelegateTest();
		Button b = new Button();
		Text t = new Text("Hello");
		t.setText("Hello world");
		b.setListener(dt.new MyClickListener());
		b.click();
		b.setListener(new ClickListener() {
			@Override
			protected void press() {
				System.out.println("press test2");
			}
		});
		b.click();
	}

	class MyClickListener extends ClickListener {

		@Override
		protected void press() {
			System.out.println("press test");
		}
	}
}
