package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {

		PApplet.main(Main.class.getName());
	}

	ControllerMain controller;

	public void settings() {

		size(500, 500);

	}

	public void setup() {
		controller = new ControllerMain(this);
	}

	public void draw() {
		background(250);
		
		noFill();
		rect(35, 35, 440, 420);
		
		rect(35, 35, 440, 30);
		
		fill(0, 102, 153);
		text("ID", 60, 60);
		text("NAME", 120, 60);
		text("BREED",268, 60);
		text("BIRTHDAY", 387, 60);
		


		
		for (int i = 0; i < controller.getDog().size(); i++) {

			textSize(15);
			
			
			controller.getDog().get(i).drawDogs(60,(60*i)+100); 
			
		}
		
		

	}

	@Override
	public void mousePressed() {
		System.out.println(mouseX);
		System.out.println(mouseY);
		controller.Sort(mouseX, mouseY);
	}

}
