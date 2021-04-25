package model;

import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {

	private PApplet app;

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

	// classes

	DogName Name;
	DogBreed Breed;
	DogBirthday Birth;

	private String[] savedId;
	private String[] savedName;
	private String[] savedBreed;
	private String[] savedBirth;

	// list
	private ArrayList<Dogs> dog;

	public Logic(PApplet app) {

		this.app = app;

		dog = new ArrayList<>();

		Name = new DogName();
		Breed = new DogBreed();
		Birth = new DogBirthday();

		savedId = new String[5];
		savedName = new String[5];
		savedBreed = new String[5];
		savedBirth = new String[5];

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

		if (mouseX > 35 && mouseX < 102 && mouseY > 35 && mouseY < 369) {

			Collections.sort(dog);

			for (int i = 0; i < dog.size(); i++) {

				String id = Integer.toString(dog.get(i).getId());

				String name = dog.get(i).getName().toLowerCase();

				String breed = dog.get(i).getBreed().toLowerCase();

				String birth = dog.get(i).getBirth();

				String newLine = id + " " + name + " " + breed + " " + birth;
				savedId[i] = newLine;

				app.saveStrings("./SavedId.txt", savedId);

				System.out.println("saved");

			}
		}

		if (mouseX > 102 && mouseX < 229 && mouseY > 35 && mouseY < 369) {

			Collections.sort(dog, Name);

			for (int i = 0; i < dog.size(); i++) {

				id = dog.get(i).getId();

				name = dog.get(i).getName().toLowerCase();

				breed = dog.get(i).getBreed().toLowerCase();

				birth = dog.get(i).getBirth();

				String newline = id + " " + name + " " + breed + " " + birth;
				savedName[i] = newline;
				app.saveStrings("./SavedName.txt", savedName);

			}
		}

		if (mouseX > 229 && mouseX < 372 && mouseY > 35 && mouseY < 369) {

			Collections.sort(dog, Breed);

			for (int i = 0; i < dog.size(); i++) {

				id = dog.get(i).getId();

				name = dog.get(i).getName().toLowerCase();

				breed = dog.get(i).getBreed().toLowerCase();

				birth = dog.get(i).getBirth();

				String newline = id + " " + name + " " + breed + " " + birth;
				savedBreed[i] = newline;
				app.saveStrings("./SavedBreed.txt", savedBreed);
			}
		}

		if (mouseX > 372 && mouseX < 475 && mouseY > 35 && mouseY < 369) {

			Collections.sort(dog, Birth);

			for (int i = 0; i < dog.size(); i++) {

				id = dog.get(i).getId();

				name = dog.get(i).getName().toLowerCase();

				breed = dog.get(i).getBreed().toLowerCase();

				birth = dog.get(i).getBirth();

				String newline = id + " " + name + " " + breed + " " + birth;
				savedBirth[i] = newline;
				app.saveStrings("./SavedBirth.txt", savedBirth);
			}

		}

	}

	public ArrayList<Dogs> getDog() {
		return dog;
	}

	public void setDog(ArrayList<Dogs> dog) {
		this.dog = dog;
	}

	public String[] getSavedName() {
		return savedName;
	}

	public String[] getSavedBreed() {
		return savedBreed;
	}

	public String[] getSavedBirth() {
		return savedBirth;
	}

	public String[] getSavedId() {
		return savedId;
	}

	public void setSavedBreed(String[] savedBreed) {
		this.savedBreed = savedBreed;
	}

	public void setSavedName(String[] savedName) {
		this.savedName = savedName;
	}

	public void setSavedBirth(String[] savedBirth) {
		this.savedBirth = savedBirth;
	}

	public void setSavedId(String[] savedId) {
		this.savedId = savedId;
	}

}
