package model;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;

	// text
	private String[] txt1;
	private String[] txt2;
	private String[] dogType;
	private String[] dogType2;

	int id;
	int id2;
	String breed;
	String birth;
	String name;

	// list
	private ArrayList<Dogs> dog;

	public Logic(PApplet app) {

		this.app = app;

		dog = new ArrayList<>();

	}

	public void separateText(PApplet app) {

		txt1 = app.loadStrings("data/imports/txt1.txt");
		txt2 = app.loadStrings("data/imports/txt2.txt");

		for (int i = 0; i < txt1.length; i++) {

			dogType = PApplet.split(txt1[i], " ");

			id = Integer.parseInt(dogType[0]);

			name = dogType[1];

			for (int j = 0; j < txt2.length; j++) {

				dogType2 = PApplet.split(txt2[i], " ");

				id2 = Integer.parseInt(dogType2[0]);

				name = dogType2[0];

				if (id == id2) {

					breed = dogType2[1];

					birth = dogType2[2];

					dog.add(new Dogs(app, id, name, breed, birth));

					System.out.println(id+" "+name+" "+breed+" "+birth);
				}

			}

		}

	}

}
