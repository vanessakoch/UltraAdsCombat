
public class Cliente extends PessoaFisica {
	private String torcida;

	public Cliente(String nome, String endereco, int idade, String cpf, String torcida) {
		super(nome, endereco, idade, cpf);
		this.torcida = torcida;
	}

	public Cliente(String nome, String endereco, int idade, String cpf) {
		super(nome, endereco, idade, cpf);
	}

	public String getTorcida() {
		return torcida;
	}

	public void setTorcida(String torcida) {
		this.torcida = torcida;
	}

	@Override
	public void entrada() {
		float ing = 80;
		float vip = ing - (20 * ing / 100);
		System.out.println("Cliente VIP paga R$: " + vip + " na entrada.");
		System.out.println("Cliente regular paga R$: " + ing + " na entrada.");
	}

}