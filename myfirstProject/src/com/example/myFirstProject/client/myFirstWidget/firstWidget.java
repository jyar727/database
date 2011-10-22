package com.example.myFirstProject.client.myFirstWidget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.widget.client.TextButton;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

public class firstWidget extends Composite {

	private static firstWidgetUiBinder uiBinder = GWT
			.create(firstWidgetUiBinder.class);
	@UiField Button button;
	@UiField TextBox txtbox;

	interface firstWidgetUiBinder extends UiBinder<Widget, firstWidget> {
	}

	public firstWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	
	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
		Window.alert("you entered "+txtbox.getText());
		
	}
}
