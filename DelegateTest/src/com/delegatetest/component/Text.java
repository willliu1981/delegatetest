package com.delegatetest.component;

public class Text {
	private String content;
	private View v = new View();

	class View {
		private String content;

	}

	public Text() {
	}

	public Text(String content) {
		this.content = content;
		change();
	}

	public void setText(String content) {
		this.content = content;
		change();
	}

	private void change() {
		v.content = this.content;
		System.out.println("View 內容 change to: " + v.content);
	}
}
