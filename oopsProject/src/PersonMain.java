public class PersonMain {

	public static void main(String[] args) {
		String []sub = new String[3];
		sub[0]="Java";
		sub[1]="Computer Network";
		sub[2]="DSA";
		
		Student s1 = new Student("Prashansa",22,"990009000",101,sub);
		Student s2 = new Student("Shweta",22,"990099000",102,sub);
		System.out.println(s1);
		System.out.println(s2);
		
	}

}