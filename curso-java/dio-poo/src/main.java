import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso js = new Curso(8);

		Mentoria ment = new Mentoria(LocalDate.now());

		System.out.println(js);
		System.out.println(ment);
	}

}
