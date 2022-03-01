import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso js = new Curso("Curso JS", "Curso de JavaScript", 8);

		Mentoria ment = new Mentoria("Mentoria JS", "Mentoria de JavaScript", LocalDate.now());

		System.out.println(js);
		System.out.println(ment);
	}

}
