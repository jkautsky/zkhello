package sample;

import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;

public class SampleControl extends GenericForwardComposer {

	Window win;
	
	public void onClick$buttonToSayHello() {
		alert("Button clicked!");
		Button btn = new Button();
		btn.setLabel("I am new!");
		btn.setParent(win);
	}

}