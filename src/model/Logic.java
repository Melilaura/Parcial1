package model;

import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;

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

				id = dog.get(i).getId();
				name = dog.get(i).getName().toLowerCase();
				breed = dog.get(i).getBreed().toLowerCase();
				birth = dog.get(i).getBirth();

				String IdLine = id + " " + name + " " + breed + " " + birth;
				savedId[i] = IdLine;

			}

			System.out.println("se guardo ID");
			app.saveStrings("./data/exports/SavedId.txt", savedId);

		}

		if (mouseX > 102 && mouseX < 229 && mouseY > 35 && mouseY < 369) {

			Collections.sort(dog, Name);

			for (int i = 0; i < dog.size(); i++) {

				id = dog.get(i).getId();
				name = dog.get(i).getName().toLowerCase();
				breed = dog.get(i).getBreed().toLowerCase();
				birth = dog.get(i).getBirth();

				String Nameline = id + " " + name + " " + breed + " " + birth;
				savedName[i] = Nameline;

			}

			System.out.println("se guardo por nombre");
			app.saveStrings("./data/exports/SavedName.txt", savedName);

		}

		if (mouseX > 229 && mouseX < 372 && mouseY > 35 && mouseY < 369) {

			Collections.sort(dog, Breed);

			for (int i = 0; i < dog.size(); i++) {

				id = dog.get(i).getId();
				name = dog.get(i).getName().toLowerCase();
				breed = dog.get(i).getBreed().toLowerCase();
				birth = dog.get(i).getBirth();

				String Breedline = id + " " + name + " " + breed + " " + birth;
				savedBreed[i] = Breedline;

			}

			System.out.println("se guardo por raza");
			app.saveStrings("/data/exports/SavedBreed.txt", savedBreed);
		}

		if (mouseX > 372 && mouseX < 475 && mouseY > 35 && mouseY < 369) {

			Collections.sort(dog, Birth);

			for (int i = 0; i < dog.size(); i++) {

				id = dog.get(i).getId();
				name = dog.get(i).getName().toLowerCase();
				breed = dog.get(i).getBreed().toLowerCase();
				birth = dog.get(i).getBirth();

				String Birthline = id + " " + name + " " + breed + " " + birth;
				savedBirth[i] = Birthline;

			}

			System.out.println("se guardo por cumpleaños");
			app.saveStrings("./data/exports/SavedBirth.txt", savedBirth);

		}

	}

	public ArrayList<Dogs> getDog() {
		return dog;
	}

	public void setDog(ArrayList<Dogs> dog) {
		this.dog = dog;
	}

}
