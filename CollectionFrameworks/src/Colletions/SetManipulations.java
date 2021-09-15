package Colletions;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class SetManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 showHashSet();
		 showTreeSet();
		 showPersonSet();
		 showPersonDuplicates();

	}

	/**
	 * No duplicates and ordered
	 */
	public static void showHashSet() {

		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(50);
		set.add(20);
		set.add(10);

		for (Integer value : set) {
			System.out.println("showHashSet "+value);
		}
	}

	/**
	 * Elements are in sorted order and no duplicates in TreeSet
	 */
	public static void showTreeSet() {

		SortedSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(50);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(60);
		set.add(10);

		for (Integer value : set) {
			System.out.println("showTreeSet :"+value);
		}
	}

	/**
	 * Set makes duplicates if not override equals() methods and hashIndex()
	 * methods
	 */
	public static void showPersonDuplicates() {

		Set<Person> hashSet = new HashSet<Person>();
		hashSet.add(new Person(10));
		hashSet.add(new Person(10));
		hashSet.add(new Person(20));
		hashSet.add(new Person(30));
		hashSet.add(new Person(30));
		hashSet.add(new Person(20));
		hashSet.add(new Person(40));

		for (Person person : hashSet) {
			System.out.println("showPersonDuplicates "+person.getAge());
		}

	}

	/**
	 * Persons are in sorted order
	 */
	public static void showPersonSet() {

		TreeSet<Person> personSet = new TreeSet<Person>();
		personSet.add(new Person(10));
		personSet.add(new Person(10));
		personSet.add(new Person(40));
		personSet.add(new Person(20));
		personSet.add(new Person(80));
		personSet.add(new Person(100));
		personSet.add(new Person(30));

		for (Person person : personSet) {
			System.out.println("showPersonSet : "+person.getAge());
		}
	}

}
