import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int round;
	private boolean aprovada;
	
	public Luta(Lutador desafiado, Lutador desafiante) {
		super();
		this.desafiado = desafiado;
		this.desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
			System.out.println("O lutador " + l1.getNome() + " vai poder lutar com " + l2.getNome() + "!!\n");
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("\nESSA LUTA NAO PODE SER APROVADA!");
		}
	}

	public void lutar() {
		if (this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("");
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			System.out.println("");
			System.out.println("======= RESULTADO DA LUTA =======");
			switch (vencedor) {
			case 0:
				System.out.println("|\t   EMPATOU!\t\t|");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("|\tVitoria do " + this.desafiado.getNome() + "\t|");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.println("|\tVitoria do " + this.desafiante.getNome() + "\t|");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
			System.out.println("=================================");

		}
	}
}
