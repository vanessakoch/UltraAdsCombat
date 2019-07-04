
public class Gerente extends Funcionario {
	private String formacao;

	public Gerente(String nome, String endereco, int idade, String cpf, String setor) {
		super(nome, endereco, idade, cpf, setor);
	}

	public Gerente(String nome, String endereco, int idade, String cpf, String setor, String formacao) {
		super(nome, endereco, idade, cpf, setor);
		this.formacao = formacao;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	@Override
	public void entrada() {
		System.out.println("Entrada livre.");
	}

	@Override
	public float recebeSalario() {
		this.setSalario(2500 + (2500 * 90 / 100));
		return getSalario();
	}

}
