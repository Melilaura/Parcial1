package model;

import java.util.Comparator;

public class DogBreed implements Comparator<Dogs> {

	@Override
	public int compare(Dogs o1, Dogs o2) {
		// TODO Auto-generated method stub
		return o1.getBreed().compareTo(o2.getBreed());
	}

}
