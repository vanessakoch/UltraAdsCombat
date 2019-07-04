
public class Treinador extends Funcionario {
	private String modalidade;

	public Treinador(String nome, String endereco, int idade, String cpf, String setor, String modalidade) {
		super(nome, endereco, idade, cpf, setor);
		this.modalidade = modalidade;
	}

	public Treinador(String nome, String endereco, int idade, String cpf, String setor) {
		super(nome, endereco, idade, cpf, setor);
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	@Override
	public float recebeSalario() {
		this.setSalario(1900 + (1900 * 30 / 100));
		return this.getSalario();
	}

}
