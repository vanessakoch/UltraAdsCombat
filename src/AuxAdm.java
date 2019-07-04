
public class AuxAdm extends Funcionario {

	public AuxAdm(String nome, String endereco, int idade, String cpf, String setor) {
		super(nome, endereco, idade, cpf, setor);
	}

	@Override
	public float recebeSalario() {
		this.setSalario(1900 + (1900 * 20 / 100));
		return this.getSalario();
	}

}
