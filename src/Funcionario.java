
public abstract class Funcionario extends PessoaFisica {
	private float salario;
	private String setor;

	public Funcionario(String nome, String endereco, int idade, String cpf, String setor) {
		super(nome, endereco, idade, cpf);
		this.setor = setor;
	}

	public Funcionario(String nome, String endereco, int idade, String cpf, float salario, String setor) {
		super(nome, endereco, idade, cpf);
		this.salario = salario;
		this.setor = setor;
	}

	public Funcionario(String nome, String endereco, String cpf) {
		super(nome, endereco, cpf);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void entrada() {
		System.out.println("Funcionario tem entrada livre");
	}

	public abstract float recebeSalario();

}