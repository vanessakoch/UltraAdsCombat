
public class Fornecedor extends PessoaJuridica {
	private Equipamento nomeEquip;
	private String inscEstadual;

	public Fornecedor(String nome, String endereco, String cnpj, String inscEstadual) {
		super(nome, endereco, cnpj);
		this.inscEstadual = inscEstadual;
	}

	public Fornecedor(String nome, String endereco, String cnpj, Equipamento nomeEquip, String inscEstadual) {
		super(nome, endereco, cnpj);
		this.nomeEquip = nomeEquip;
		this.inscEstadual = inscEstadual;
	}

	public Equipamento getEquipamento() {
		return nomeEquip;
	}

	public void setEquipamento(Equipamento nomeEquip) {
		this.nomeEquip = nomeEquip;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	@Override
	public void entrada() {
		System.out.println("Entrada gratuita com horario de entrega agendada.");
	}
}
