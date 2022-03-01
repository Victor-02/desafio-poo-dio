import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;

	public Mentoria(LocalDate data) {
		super();
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria Titulo=" + getTitulo() + ", Descricao=" + getDescricao() + ", Data=" + data + "";
	}

	@Override
	public double calculaXp() {

		return XP_PADRAO + 20d;
	}

}
