package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private boolean type;

	// text
	private String[] txt1;
	private String[] txt2;
	private String[] dogType;
	private String[] dogType2;

	// variables
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

		txt1 = app.loadStrings("./imports/txt1.txt");
		txt2 = app.loadStrings("./imports/txt2.txt");

		for (int i = 0; i < txt1.length; i++) {

			dogType = PApplet.split(txt1[i], " ");

			id = Integer.parseInt(dogType[0]);

			name = dogType[1];
			
			

			for (int j = 0; j < txt2.length; j++) {

				dogType2 = PApplet.split(txt2[j], " ");

				id2 = Integer.parseInt(dogType2[0]);

				
				if (id == id2) {

					breed = dogType2[1];

					birth = dogType2[2];

					dog.add(new Dogs(app, id, name, breed, birth));

					System.out.println(id + " " + name + " " + breed + " " + birth);
					
				}

			}

		}

	}

	public void SortList(int mouseX, int mouseY) {
		

			Collections.sort(dog);

			for (int i = 0; i < dog.size(); i++) {

				id = dog.get(i).getId();

				name = dog.get(i).getName().toLowerCase();

				breed = dog.get(i).getBreed().toLowerCase();

				birth = dog.get(i).getBirth();
				
				System.out.println("Yessss");

			}

			
			
		}
	
	public ArrayList<Dogs> getDog() {
		return dog;
	}
	
	public void setDog(ArrayList<Dogs> dog) {
		this.dog = dog;
	}

	
}
