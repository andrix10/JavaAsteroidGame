package com.mycompany.myapp;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class CSaucer extends Command{
	private GameWorld gw;
	
	public CSaucer(GameWorld gw){
		super("Create Saucer");
		this.gw = gw;
	}
	
	public void actionPerformed(ActionEvent ev) {
		gw.createSaucer();
	}
}
