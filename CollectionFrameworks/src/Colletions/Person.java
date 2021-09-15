package Colletions;



public class Person implements Comparable{
	
	private int age;
	
	public Person(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	/**
	 * Override equals method to remove duplicates 
	 */
	@Override
	public boolean equals(Object object) {
		
		if(object instanceof Person){
			Person person = (Person)object;
			return (this.getAge() == person.getAge());
		}else{
			return false;
		}
	}
	
	/**
	 * Override hashCode method to remove duplicates
	 */
	@Override
	public int hashCode() {
		return this.age;
	}

	/**
	 * To compare objects internal content and sort
	 */
	@Override
	public int compareTo(Object object) {
		
		if(object != null){
			Person person = (Person)object;
			return (this.getAge() - person.getAge());
		}
		else
			return 0;
	}
}
