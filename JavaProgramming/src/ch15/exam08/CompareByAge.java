package ch15.exam08;

import java.util.Comparator;

public class CompareByAge implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		// return Integer.compare(o1.getAge(), o2.getAge());

		return String.valueOf(o1.getAge()).compareTo(String.valueOf(o2.getAge()));
	}

}
