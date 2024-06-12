package BasicPgm;

public class RemoveCharacter {

	public static void main(String[] args) {
		String s ="!@#$% selenium JAVA BasicProgram 28-05-2022";
		
		s = s.replaceAll("[^a-zA-Z-0-9 ]", "");
		System.out.println(s);

	}

}
