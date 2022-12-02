public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public boolean equals(PersonWithJob aPerson) {
		if(aPerson == null) return false;

		boolean isEqual = this.name.equals(aPerson.getName());
		return isEqual;
	}

	public static void main(String[] args) {

	}
}
