
public abstract class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica(String nome, String endereco, String cnpj) {
		super(nome, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public static boolean verificaCnpj(String cnpj) {
		if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") || cnpj.equals("22222222222222")
				|| cnpj.equals("33333333333333") || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
				|| cnpj.equals("66666666666666") || cnpj.equals("77777777777777") || cnpj.equals("88888888888888")
				|| cnpj.equals("99999999999999") || (cnpj.length() != 14))
			return (false);

		char dig1, dig2;
		int soma, i, resp, linha1, linha2;

		soma = 0;
		linha2 = 2;
		for (i = 11; i >= 0; i--) {
			linha1 = Integer.parseInt(String.valueOf(cnpj.charAt(i)));
			soma = soma + (linha1 * linha2);
			linha2 += 1;
			if (linha2 == 10)
				linha2 = 2;
		}
		resp = 11 - (soma % 11);
		if ((resp == 10) || (resp == 11)) {
			dig1 = '0';
		} else {
			dig1 = (char) (resp + '0');
		}

		soma = 0;
		linha2 = 2;
		for (i = 12; i >= 0; i--) {
			linha1 = Integer.parseInt(String.valueOf(cnpj.charAt(i)));
			soma = soma + (linha1 * linha2);
			linha2 += 1;
			if (linha2 == 10)
				linha2 = 2;
		}
		resp = 11 - (soma % 11);
		if ((resp == 10) || (resp == 11)) {
			dig2 = '0';
		} else {
			dig2 = (char) (resp + '0');
		}

		if ((dig1 == cnpj.charAt(12)) && (dig2 == cnpj.charAt(13))) {
			return (true);
		} else {
			return (false);
		}
	}
}