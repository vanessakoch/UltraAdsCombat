public class Equipamento {
	private String nome;
	private int quantidade;
	private float valorUnidade;
	private Fornecedor nomeFornecedor;

	public Equipamento(String nome, int quantidade, float valorUnidade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnidade = valorUnidade;
	}

	public Equipamento(String nome, int quantidade, float valorUnidade, Fornecedor nomeFornecedor) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnidade = valorUnidade;
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorUnidade() {
		return valorUnidade * this.quantidade;
	}

	public void setValorUnidade(float valorUnidade) {
		this.valorUnidade = valorUnidade;
	}

	public Fornecedor getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(Fornecedor nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public void remover(int quantidade) {
		this.quantidade -= quantidade;
	}

	public void add(int quantidade) {
		this.quantidade += quantidade;
	}

}
