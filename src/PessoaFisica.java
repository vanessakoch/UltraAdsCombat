
public abstract class PessoaFisica extends Pessoa {
	private int idade;
	private String cpf;

	public PessoaFisica(String nome, String endereco, int idade, String cpf) {
		super(nome, endereco);
		this.idade = idade;
		this.cpf = cpf;
	}

	public PessoaFisica(String nome, String endereco, String cpf) {
		super(nome, endereco);
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public static boolean verificaCpf(String cpf) {
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || (cpf.length() != 11))
			return (false);

		char dig1, dig2;
		int soma, i, resp, linha1, linha2;

		soma = 0;
		linha2 = 10;
		for (i = 0; i < 9; i++) {
			linha1 = Integer.parseInt(String.valueOf(cpf.charAt(i)));
			soma = soma + (linha1 * linha2);
			linha2 -= 1;
		}

		resp = 11 - (soma % 11);
		if ((resp == 10) || (resp == 11))
			dig1 = '0';
		else
			dig1 = (char) (resp + '0');

		soma = 0;
		linha2 = 11;
		for (i = 0; i < 10; i++) {
			linha1 = Integer.parseInt(String.valueOf(cpf.charAt(i)));
			soma = soma + (linha1 * linha2);
			linha2 -= 1;
		}
		resp = 11 - (soma % 11);
		if ((resp == 10) || (resp == 11))
			dig2 = '0';
		else
			dig2 = (char) (resp + '0');

		if ((dig1 == cpf.charAt(9)) && (dig2 == cpf.charAt(10)))
			return (true);
		else
			return (false);
	}

}