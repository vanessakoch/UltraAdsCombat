
public class Lutador extends PessoaFisica {
	private String nacionalidade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;

	public Lutador(String nome, String endereco, String cpf, String nacionalidade, float altura, float peso,
			int vitorias, int derrotas, int empates) {
		super(nome, endereco, cpf);
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public Lutador(String nome, String endereco, int idade, String cpf, String nacionalidade, float altura, float peso,
			int vitorias, int derrotas, int empates) {
		super(nome, endereco, idade, cpf);
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2f) {
			this.categoria = "Peso muito baixo!!";
		} else if (this.peso <= 70.3) {
			this.categoria = "Peso Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Peso Medio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Peso Pesado";
		} else {
			this.categoria = "Peso invalido!";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("----------------------------------------------");
		System.out.println("Chegou a HORA! Apresentamos o lutador " + this.getNome() + "!!");
		System.out.print("Diretamente de" + this.getNacionalidade());
		System.out.print("! Com " + this.getIdade() + " anos, " + this.altura + " metros ");
		System.out.println("e pesando " + this.getPeso() + "Kg.");
		System.out.println(this.getVitorias() + " Vitorias");
		System.out.println(this.getDerrotas() + " Derrotas");
		System.out.println(this.getEmpates() + " Empates");
	}

	public void status() {
		System.out.println("");
		System.out.println(this.getNome() + " e um " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes.");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes.");
		System.out.println("Empatou " + this.getEmpates() + " vezes.");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	@Override
	public void entrada() {
		System.out.println("Lutador tem entrada livre.");
	}

}