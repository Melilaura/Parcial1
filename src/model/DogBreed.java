package model;

import java.util.Comparator;

public class DogBreed implements Comparator<Dogs> {

	
	public int compare(Dogs o1, Dogs o2) {
		return o1.getBreed().compareTo(o2.getBreed());
	}

}
