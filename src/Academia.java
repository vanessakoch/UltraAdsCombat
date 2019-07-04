
public class Academia {
	private String nome;
	private String cnpj;
	private String modalidade;
	private Gerente cpf;
	private String endereco;

	public Academia(String nome, String modalidade, String cnpj, Gerente cpf, String endereco) {
		super();
		this.nome = nome;
		this.modalidade = modalidade;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Academia(String nome, String cnpj, String endereco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Gerente getCpfGerente() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

}