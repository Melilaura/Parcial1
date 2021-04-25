package model;


import processing.core.PApplet;

public class Dogs {
	
	private PApplet app;
	
	private String id, name, breed, birth;
	
	
	public Dogs(PApplet app, String id, String name, String breed, String birth) {

	this.app=app;
		
		this.id=id;
		this.name=name;
		this.breed=breed;
		this.birth=birth;
		

	}
	
	public void drawInfo(int x, int y) {

		app.text("Id:" + id, x, y);
		app.text("Name:" + name, x, y + 20);
		app.text("Breed:" + breed, x, y + 40);
		app.text("birth:" + birth, x, y + 60);

	}
	



}
