package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {

		PApplet.main(Main.class.getName());
	}

	ControllerMain controller;
	int type;

	public void settings() {

		size(500, 500);

	}

	public void setup() {
		controller = new ControllerMain(this);
		type = 1;
	}

	public void draw() {
		background(255, 166, 166);

		noStroke();
		fill(255, 216, 216);
		rect(35, 35, 440, 340);

		fill(255, 255, 255);
		rect(35, 35, 440, 30);

		fill(255, 166, 166);
		text("ID", 60, 60);
		text("NAME", 120, 60);
		text("BREED", 268, 60);
		text("BIRTHDAY", 387, 60);
		textAlign(CENTER);

		textSize(20);
		fill(183, 206, 255);
		text("PELUDOS SIN HOGAR", 260, 450);
		textSize(15);
		text("Presione sobre la columna para organizar de acuerdo a esta", 260, 480);

		for (int i = 0; i < controller.getDog().size(); i++) {

			textSize(15);
			fill(255, 166, 166);
			controller.getDog().get(i).drawDogs(60, (60 * i) + 100);
		}

		fill(208, 242, 255);

		if (type == 1) {
			text("Organizado por ID", 260, 400);
		}
		if (type == 2) {
			text("Organizado por NOMBRE", 260, 400);
		}
		if (type == 3) {
			text("Organizado por RAZA", 260, 400);
		}
		if (type == 4) {
			text("Organizado por CUMPLEAÑOS", 260, 400);
		}
	}

	@Override
	public void mousePressed() {

		controller.Sort(mouseX, mouseY);

		// ID
		if (mouseX > 35 && mouseX < 102 && mouseY > 35 && mouseY < 369) {
			type = 1;
		}

		// NAME
		if (mouseX > 102 && mouseX < 229 && mouseY > 35 && mouseY < 369) {
			type = 2;
		}

		// Breed
		if (mouseX > 229 && mouseX < 372 && mouseY > 35 && mouseY < 369) {
			type = 3;
		}

		// Birthday
		if (mouseX > 372 && mouseX < 475 && mouseY > 35 && mouseY < 369) {
			type = 4;
		}
	}

}
