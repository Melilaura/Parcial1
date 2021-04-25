package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Dogs implements Comparable<Dogs> {

	private PApplet app;

	private String name, breed, birth;
	private int id;
	
	

	public Dogs(PApplet app, int id, String name, String breed, String birth) {

		this.app = app;

		this.id = id;
		this.name = name;
		this.breed = breed;
		this.birth = birth;


	}

	public void drawDogs(int x, int y) {

		app.text(id, x, y);
		app.text(name, x + 60, y);
		app.text(breed, x + 180, y);
		app.text(birth, x + 320, y);
		

	}

	public String getBirth() {
		return birth;
	}

	public String getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int compareTo(Dogs nextDog) {
		// TODO Auto-generated method stub
		return this.id - nextDog.getId();
	}

}
