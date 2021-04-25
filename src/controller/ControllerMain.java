package controller;

import java.util.ArrayList;
import model.Logic;
import model.Dogs;
import processing.core.PApplet;

public class ControllerMain {

	private PApplet app;

	private Logic logic;
	boolean type;

	public ControllerMain(PApplet app) {

		this.app = app;

		logic = new Logic(app);
		logic.separateText(app);
	}

	public void Sort(int mouseX, int mouseY) {

		logic.SortList(mouseX, mouseY);
	}

	public ArrayList<Dogs> getDog() {
		return logic.getDog();
	}

	public Logic getLogic() {
		return logic;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
	}

}
