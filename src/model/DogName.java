package model;

import java.util.Comparator;

public class DogName implements Comparator<Dogs> {

	public int compare(Dogs o1, Dogs o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
