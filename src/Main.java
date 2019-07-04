import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<Lutador> listaLutador;
	private static List<Cliente> listaCliente;
	private static List<Treinador> listaTreinador;
	private static List<Gerente> listaGerente;
	private static List<Equipamento> equipamento;
	private static List<Fornecedor> listaFornecedor;
	private static List<AuxAdm> listaAuxiliar;

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		listaLutador = new ArrayList<Lutador>();
		listaCliente = new ArrayList<Cliente>();
		listaTreinador = new ArrayList<Treinador>();
		listaGerente = new ArrayList<Gerente>();
		equipamento = new ArrayList<Equipamento>();
		listaFornecedor = new ArrayList<Fornecedor>();
		listaAuxiliar = new ArrayList<AuxAdm>();

		listaLutador.add(new Lutador("Python", "Rua A", "46315975003", "França", 1.75f, 68.9f, 11, 2, 1));
		listaLutador.add(new Lutador("Script", "Rua B", "82394820071", "Brasil", 1.68f, 57.8f, 14, 2, 3));
		listaLutador.add(new Lutador("Shadow", "Rua C", "07642810032", "EUA", 1.65f, 80.9f, 12, 2, 1));
		listaLutador.add(new Lutador("Code", "Rua D", "63476851087", "Australia", 1.93f, 81.6f, 13, 0, 2));
		listaLutador.add(new Lutador("Java", "Rua E", "24155318040", "Brasil", 1.71f, 119.3f, 5, 4, 3));
		listaLutador.add(new Lutador("Nerd", "Rua F", "61174929014", "EUA", 1.81f, 105.7f, 12, 2, 4));
		listaCliente.add(new Cliente("Vanessa", "Rua Z", 26, "62990608915"));
		listaGerente.add(new Gerente("Amanda", "Rua 0 ", 48, "07503917903", "Compras", "Administração"));
		listaFornecedor.add(new Fornecedor("EsseMesmo", "Rua H", "26994558000123", "12345667"));
		listaTreinador.add(new Treinador("Coach", "Rua 0", 46, "07789675494", "Ring"));
		listaAuxiliar.add(new AuxAdm("Maria", "Rua 09", 34, "36957658015", "Financeiro"));

		System.out.println(" --------------------------");
		System.out.println("|    ULTRA ADS COMBAT     |");
		System.out.println(" --------------------------");

		while (true) {
			menu();
			int escolha = t.nextInt();

			if (escolha == 0) {
				break;
			}
			if (escolha == 1) {
				System.out.println("[1] - Cadastrar Lutador");
				System.out.println("[2] - Listar Lutadores");
				System.out.println("[3] - Editar Lutador");
				System.out.println("[4] - Remover Lutador");
				int opcao = t.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("----------------------");
					System.out.println("CADASTRAR LUTADOR\n");
					System.out.println("Digite o nome do Lutador: ");
					String nome = t.next().trim();
					System.out.println("Digite a idade:");
					int idade = t.nextInt();
					System.out.println("Digite o endereco: ");
					String endereco = t.next().trim();
					System.out.println("Digite a nacionalidade: ");
					String nacionalidade = t.next().trim();
					System.out.println("Digite a altura:");
					float altura = t.nextFloat();
					System.out.println("Digite o peso: ");
					float peso = t.nextFloat();
					System.out.println("Quantas vitorias?");
					int vitorias = t.nextInt();
					System.out.println("Quantas derrotas?");
					int derrotas = t.nextInt();
					System.out.println("Quantos empates?");
					int empates = t.nextInt();
					System.out.println("Digite os numeros do CPF: ");
					String cpf = t.next().trim();
					while (PessoaFisica.verificaCpf(cpf) == false) {
						System.out.printf("Erro, CPF invalido!\n");
						System.out.println("\nDigite um CPF valido: ");
						cpf = t.next();
					}
					System.out.printf("\nOs dados foram gravados com sucesso!\n");
					listaLutador.add(new Lutador(nome, endereco, idade, cpf, nacionalidade, altura, peso, vitorias,
							derrotas, empates));

					break;
				case 2:
					imprimeLutador();
					break;

				case 3:
					imprimeLutador();
					editaLutador(t);
					break;
				case 4:
					imprimeLutador();
					removeLutador(t);
					break;
				default:
					break;
				}
			}

			if (escolha == 2) {
				imprimeLutador();
				int indLut = 0;
				System.out.println("------------------------");
				System.out.println("QUAL LUTA GOSTARIA DE ASSISTIR?\n");
				System.out.println("Digite o indice do desafiante: ");
				indLut = t.nextInt();
				Lutador a = listaLutador.get(indLut);
				System.out.println("Digite o indice do desafiado: ");
				indLut = t.nextInt();
				Lutador b = listaLutador.get(indLut);
				Luta luta = new Luta(a, b);
				luta.marcarLuta(a, b);
				System.out.println("Deseja ver a luta ou os status? 1 - Sim | 2 - Sair");
				int opcao = t.nextInt();
				if (opcao == 1) {
					luta.lutar();
					a.status();
					b.status();
				}
			}

			if (escolha == 3) {
				System.out.println("[1] - Cadastrar Treinador");
				System.out.println("[2] - Listar Treinadores");
				System.out.println("[3] - Editar Lutador");
				System.out.println("[4] - Remover Lutador");
				int opcao = t.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("----------------------");
					System.out.println("CADASTRAR TREINADOR\n");
					System.out.println("Digite o nome do treinador: ");
					String nome = t.next().trim();
					System.out.println("Digite o endereco: ");
					String endereco = t.next().trim();
					System.out.println("Digite a idade: ");
					int idade = t.nextInt();
					System.out.println("Digite o setor: ");
					String setor = t.next().trim();
					System.out.println("Digite a modalidade do treinador: ");
					String modalidade = t.next().trim();
					System.out.println("Digite os numeros do CPF: ");
					String cpf = t.next().trim();
					while (PessoaFisica.verificaCpf(cpf) == false) {
						System.out.printf("Erro, CPF invalido!\n");
						System.out.println("\nDigite um CPF valido: ");
						cpf = t.next();
					}
					System.out.printf("\nOs dados foram gravados com sucesso!\n");
					listaTreinador.add(new Treinador(nome, endereco, idade, cpf, setor, modalidade));
					break;
				case 2:
					imprimeTreinador();
					break;
				case 3:
					imprimeTreinador();
					editaTreinador(t);
					break;
				case 4:
					imprimeTreinador();
					removeTreinador(t);
					break;
				default:
					break;
				}
			}

			if (escolha == 4) {
				System.out.println("[1] - Cadastrar Cliente");
				System.out.println("[2] - Listar Clientes");
				System.out.println("[3] - Editar Cliente");
				System.out.println("[4] - Remover Cliente");
				int opcao = t.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("----------------------");
					System.out.println("CADASTRAR CLIENTE\n");
					System.out.println("Digite o nome do Cliente: ");
					String nome = t.next().trim();
					System.out.println("Digite o endereco: ");
					String endereco = t.next().trim();
					System.out.println("Digite a idade: ");
					int idade = t.nextInt();
					System.out.println("Digite os numeros do CPF: ");
					String cpf = t.next().trim();
					while (PessoaFisica.verificaCpf(cpf) == false) {
						System.out.printf("Erro, CPF invalido!\n");
						System.out.println("\nDigite um CPF valido: ");
						cpf = t.next().trim();
					}
					System.out.println("\nDigite a torcida do cliente ou 0 para concluir: ");
					String torcida = t.next().trim();
					if (torcida == "0") {
						System.out.printf("\nOs dados foram gravados com sucesso!\n");
						listaCliente.add(new Cliente(nome, endereco, idade, cpf));
					} else {
						System.out.printf("\nOs dados foram gravados com sucesso!\n");
						listaCliente.add(new Cliente(nome, endereco, idade, cpf, torcida));
					}
					break;
				case 2:
					imprimeCliente();
					break;
				case 3:
					imprimeCliente();
					editaCliente(t);
					break;
				case 4:
					imprimeCliente();
					removeCliente(t);
					break;
				default:
					break;
				}
			}

			if (escolha == 5) {
				System.out.println("[1] - Adicionar Gerente");
				System.out.println("[2] - Listar Gerentes");
				System.out.println("[3] - Editar Gerente");
				System.out.println("[4] - Remover Gerente");
				int opcao = t.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("----------------------");
					System.out.println("CADASTRAR GERENTE\n");
					System.out.println("Digite o nome do gerente:");
					String nome = t.next().trim();
					System.out.println("Digite o endereco:");
					String endereco = t.next().trim();
					System.out.println("Digite a idade:");
					int idade = t.nextInt();
					System.out.println("Qual o setor da gerencia?");
					String setor = t.next().trim();
					System.out.println("Digite os numeros do CPF: ");
					String cpf = t.next().trim();
					while (PessoaFisica.verificaCpf(cpf) == false) {
						System.out.printf("Erro, CPF invalido!\n");
						System.out.println("\nDigite um CPF valido: ");
						cpf = t.next().trim();
					}
					System.out.println("\nDigite a formacao do gerente ou 0 para concluir: ");
					String formacao = t.next().trim();
					if (formacao == "0") {
						System.out.printf("\nOs dados foram gravados com sucesso!\n");
						listaGerente.add(new Gerente(nome, endereco, idade, cpf, setor));
					} else {
						System.out.printf("\nOs dados foram gravados com sucesso!\n");
						listaGerente.add(new Gerente(nome, endereco, idade, cpf, setor, formacao));
					}
					break;
				case 2:
					imprimeGerente();
					break;
				case 3:
					imprimeGerente();
					editaGerente(t);
					break;
				case 4:
					imprimeGerente();
					removeGerente(t);
				default:
					break;
				}
			}

			if (escolha == 6) {
				int resposta;
				System.out.println("[1] - Adicionar um equipamento");
				System.out.println("[2] - Listar equipamentos");
				System.out.println("[3] - Adicionar quantidade");
				System.out.println("[4] - Remover quantidade");
				System.out.println("[5] - Remover um equipamento");

				resposta = t.nextInt();
				switch (resposta) {
				case 1:
					addEquipamento(t);
					break;
				case 2:
					imprimeEquipamentos();
					break;
				case 3:
					imprimeEquipamentos();
					addQuantidade(t);
					break;
				case 4:
					imprimeEquipamentos();
					retiraQuantidade(t);
					break;
				case 5:
					imprimeEquipamentos();
					removerEquipamento(t);
					break;
				default:
					break;
				}
			}
			if (escolha == 7) {
				System.out.println("[1] - Cadastrar Fornecedor");
				System.out.println("[2] - Listar Fornecedores");
				System.out.println("[3] - Editar Fornecedor");
				System.out.println("[4] - Remover Fornecedor");
				int opcao = t.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("----------------------");
					System.out.println("CADASTRAR FORNECEDOR\n");
					System.out.println("Digite o nome do fornecedor:");
					String nome = t.next().trim();
					System.out.println("Digite o endereco:");
					String endereco = t.next().trim();
					System.out.println("Qual a inscricao estadual?");
					String inscEstadual = t.next().trim();
					System.out.println("Digite os numeros do CNPJ: ");
					String cnpj = t.next();
					while (PessoaJuridica.verificaCnpj(cnpj) == false) {
						System.out.printf("Erro, CNPJ invalido!\n");
						System.out.println("\nDigite um CNPJ valido: ");
						cnpj = t.next().trim();
					}
					System.out.printf("\nOs dados foram gravados com sucesso!\n");
					listaFornecedor.add(new Fornecedor(nome, endereco, cnpj, inscEstadual));
					break;
				case 2:
					imprimeFornecedor();
					break;
				case 3:
					imprimeFornecedor();
					editaFornecedor(t);
					break;
				case 4:
					imprimeFornecedor();
					removeFornecedor(t);
				default:
					break;
				}
			}
			if (escolha == 8) {
				System.out.println("Escolha uma Opcao:");
				System.out.println("[1] Ingresso para Cliente");
				System.out.println("[2] Ingresso para Lutador");
				System.out.println("[3] Ingresso para Treinador");
				System.out.println("[4] Ingresso para Fornecedor");
				int op = t.nextInt();
				switch (op) {
				case 1:
					for (Cliente clientes : listaCliente) {
						clientes.entrada();
						break;
					}
					break;
				case 2:
					for (Lutador lutadores : listaLutador) {
						lutadores.entrada();
						break;
					}
					break;
				case 3:
					for (Treinador treinadores : listaTreinador) {
						treinadores.entrada();
						break;
					}
					break;
				case 4:
					for (Fornecedor fornecedores : listaFornecedor) {
						fornecedores.entrada();
						break;
					}
					break;
				default:
					break;
				}
			}
			if (escolha == 9) {
				System.out.println("\tEscolha uma opcao:");
				System.out.println("[1] - Salario do Auxiliar Administrativo");
				System.out.println("[2] - Salario do Treinador");
				System.out.println("[3] - Salario do Gerente");
				int op = t.nextInt();
				switch (op) {
				case 1:
					for (AuxAdm auxiliares : listaAuxiliar) {
						System.out.println(
								"O auxiliar administrativo recebe R$: " + auxiliares.recebeSalario() + " por mes.");
						break;
					}
					break;
				case 2:
					for (Treinador treinadores : listaTreinador) {
						System.out.println("O Treinador recebe R$: " + treinadores.recebeSalario() + " por mes.");
						break;
					}
					break;
				case 3:
					for (Gerente gerentes : listaGerente) {
						System.out.println("O gerente recebe R$: " + gerentes.recebeSalario() + " por mes.");
						break;
					}
					break;
				default:
					break;
				}
			}
			if (escolha == 10) {
				System.out.println("Escolha uma opcao");
				System.out.println("[1] Listar pessoas físicas");
				System.out.println("[2] Listar pessoas juridicas");
				int op = t.nextInt();
				if(op == 1) {
					imprimirPessoasFisica();
				}
				if(op == 2) {
					imprimirPessoasJuridica();
				}
			}
		}
		t.close();
	}

	private static void menu() {
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("\t  MENU\n");
		System.out.println("   ESCOLHA UMA OPCAO\n");
		System.out.println(" [1] - Lutadores");
		System.out.println(" [2] - Escolher uma Luta");
		System.out.println(" [3] - Treinadores");
		System.out.println(" [4] - Clientes");
		System.out.println(" [5] - Gerentes");
		System.out.println(" [6] - Equipamentos");
		System.out.println(" [7] - Fornecedores");
		System.out.println(" [8] - Consultar Entradas");
		System.out.println(" [9] - Consultar Salarios");
		System.out.println("[10] - Listar Pessoa Físicas/Juridicas");
		System.out.println(" [0] - Sair");
		System.out.println("\n------------------------------");
	}

	private static void imprimePessoa(Pessoa pessoa) {
		System.out.print(pessoa.getNome() + " Endereco: " + pessoa.getEndereco());
	}

	private static void imprimePessoaFisica(PessoaFisica pFisica) {
		System.out.println("Nome: " + pFisica.getNome() + " Idade : " + pFisica.getIdade() + " Endereco : " + pFisica.getEndereco() + " CPF: "
				+ pFisica.getCpf());
	}

	private static void imprimePessoaJuridica(PessoaJuridica pJuridica) {
		System.out.println("Nome: " + pJuridica.getNome() + " Endereço:" + pJuridica.getEndereco() + " Cnpj: " + pJuridica.getCnpj());
	}

	private static void imprimirPessoasFisica() {
		for (Lutador lutador : listaLutador) {
			imprimePessoaFisica(lutador);
		}
		for (Cliente clientes : listaCliente) {
			imprimePessoaFisica(clientes);
		}
		for (Gerente gerente : listaGerente) {
			imprimePessoaFisica(gerente);
		}
		for (Treinador treinador : listaTreinador) {
			imprimePessoaFisica(treinador);
		}
		for (AuxAdm auxiliar : listaAuxiliar) {
			imprimePessoaFisica(auxiliar);
		}
	}
	private static void imprimirPessoasJuridica() {
		for(Fornecedor fornecedor : listaFornecedor) {
			imprimePessoaJuridica(fornecedor);
		}
	}

	private static void imprimeLutador() {
		System.out.println("------------------------------");
		System.out.println("LUTADORES CADASTRADOS\n");
		for (int indLut = 0; indLut < listaLutador.size(); indLut++) {
			System.out.print("Lutador " + indLut + ": ");
			imprimePessoa(listaLutador.get(indLut));
			System.out.print(" Categoria: " + listaLutador.get(indLut).getCategoria());
			System.out.println(" | Vitorias: " + listaLutador.get(indLut).getVitorias() + " Derrotas: "
					+ listaLutador.get(indLut).getDerrotas() + " Empates: " + listaLutador.get(indLut).getEmpates());
		}
		if (listaLutador.isEmpty()) {
			System.out.println("Nenhum lutador foi cadastrado.");
		}
	}

	private static void editaLutador(Scanner t) {
		System.out.println("\nDigite o nome do Lutador que deseja Alterar:");
		String nome = t.next().trim();
		boolean achou = false;
		for (Lutador lutadores : listaLutador) {
			if (lutadores.getNome().equals(nome)) {
				achou = true;
				System.out.println("\nDigite o novo nome que deseja incluir:");
				String novo = t.next().trim();
				lutadores.setNome(novo);
			}
		}
		if (achou == true) {
			System.out.println("\nEditado com sucesso!");
		} else {
			System.out.println("\nLutador nao encontrado!");
		}
	}

	private static void removeLutador(Scanner t) {
		System.out.println("\nDigite o Nome do Lutador para Excluir: ");
		String remover = t.next().trim();
		boolean achou = false;
		for (int i = 0; i < listaLutador.size(); i++) {
			if (listaLutador.get(i).getNome().equals(remover)) {
				listaLutador.remove(i);
				achou = true;
			}
		}
		if (achou == true) {
			System.out.println("\nExcluido com sucesso!");
		} else {
			System.out.println("\nLutador nao encontrado!");
		}
	}

	private static void imprimeCliente() {
		System.out.println("------------------------------");
		System.out.println("\nCLIENTES CADASTRADOS\n");
		for (int indCli = 0; indCli < listaCliente.size(); indCli++) {
			System.out.print("Cliente " + indCli + ": ");
			imprimePessoa(listaCliente.get(indCli));
			System.out.println(" Idade " + listaCliente.get(indCli).getIdade() + " Endereço " + listaCliente.get(indCli).getEndereco()
					+ " Cpf: " + listaCliente.get(indCli).getCpf());
			System.out.println("");
		}
		if (listaCliente.isEmpty()) {
			System.out.println("Nenhum cliente foi cadastrado.");
		}
	}

	private static void editaCliente(Scanner t) {
		boolean achou = false;
		System.out.println("\nDigite o nome do Cliente que deseja Alterar:");
		String nome = t.next().trim();
		for (Cliente clientes : listaCliente) {
			if (clientes.getNome().equals(nome)) {
				System.out.println("Digite o novo nome que deseja incluir:");
				String novo = t.next().trim();
				clientes.setNome(novo);
				achou = true;
			}
		}
		if (achou == true) {
			System.out.println("\nEditado com sucesso!");
		} else {
			System.out.println("\nCliente nao encontrado!");
		}
	}

	private static void removeCliente(Scanner t) {
		boolean achou = false;
		System.out.println("Digite o Nome do Cliente para Excluir: ");
		String remover = t.next().trim();
		for (int i = 0; i < listaCliente.size(); i++) {
			if (listaCliente.get(i).getNome().equals(remover)) {
				listaCliente.remove(i);
				achou = true;
			}
		}
		if (achou == true) {
			System.out.println("\nExcluido com sucesso!");
		} else {
			System.out.println("\nCliente nao encontrado!");
		}
	}

	private static void imprimeTreinador() {
		System.out.println("------------------------------");
		System.out.println("\nTREINADORES CADASTRADOS\n");
		for (int indTre = 0; indTre < listaTreinador.size(); indTre++) {
			System.out.print("Treinador " + indTre + ": ");
			imprimePessoa(listaTreinador.get(indTre));
			System.out.println( " Salario R$: " + listaTreinador.get(indTre).recebeSalario());
		}
		if (listaTreinador.isEmpty()) {
			System.out.println("Nenhum treinador foi cadastrado.");
		}
	}

	private static void editaTreinador(Scanner t) {
		boolean achou = false;
		System.out.println("\nDigite o nome do Treinador que deseja Alterar:");
		String nome = t.next().trim();
		for (Treinador treinadores : listaTreinador) {
			if (treinadores.getNome().equals(nome)) {
				System.out.println("Digite o novo nome que deseja incluir:");
				String novo = t.next().trim();
				treinadores.setNome(novo);
				achou = true;
			}
		}
		if (achou == true) {
			System.out.println("\nEditado com sucesso!");
		} else {
			System.out.println("\nTreinador nao encontrado!");
		}
	}

	private static void removeTreinador(Scanner t) {
		boolean achou = false;
		System.out.println("\nDigite o Nome do Treinador para Excluir: ");
		String remover = t.next().trim();
		for (int i = 0; i < listaTreinador.size(); i++) {
			if (listaTreinador.get(i).getNome().equals(remover)) {
				listaTreinador.remove(i);
				achou = true;
			}
		}
		if (achou == true) {
			System.out.println("\nExcluido com sucesso!");
		} else {
			System.out.println("\nTreinador nao encontrado!");
		}
	}

	private static void imprimeGerente() {
		System.out.println("------------------------------");
		System.out.println("\nGERENTES CADASTRADOS\n");
		for (int indGe = 0; indGe < listaGerente.size(); indGe++) {
			System.out.print("Gerente " + indGe + ": ");
			imprimePessoa(listaGerente.get(indGe));
			System.out.println(
					" Setor: " + listaGerente.get(indGe).getSetor() + " Salario R$: " + listaGerente.get(indGe).recebeSalario());
		}
		if (listaGerente.isEmpty()) {
			System.out.println("Nenhum gerente foi cadastrado.");
		}
	}

	private static void editaGerente(Scanner t) {
		boolean achou = false;
		System.out.println("\nDigite o nome do Gerente que deseja Alterar:");
		String nome = t.next().trim();
		for (Gerente gerentes : listaGerente) {
			if (gerentes.getNome().equals(nome)) {
				System.out.println("\nDigite o novo nome que deseja incluir:");
				String novo = t.next().trim();
				gerentes.setNome(novo);
				achou = true;
			}
		}
		if (achou == true) {
			System.out.println("\nEditado com sucesso!");
		} else {
			System.out.println("\nGerente nao encontrado!");
		}
	}

	private static void removeGerente(Scanner t) {
		boolean achou = false;
		System.out.println("\nDigite o Nome do Gerente para Excluir: ");
		String remover = t.next().trim();
		for (int i = 0; i < listaGerente.size(); i++) {
			if (listaGerente.get(i).getNome().equals(remover)) {
				listaGerente.remove(i);
				achou = true;
			}
		}
		if (achou == true) {
			System.out.println("\nExcluido com sucesso!");
		} else {
			System.out.println("\nGerente nao encontrado!");
		}
	}

	private static void imprimeEquipamentos() {
		System.out.println("------------------------------");
		System.out.println("\nEQUIPAMENTOS CADASTRADOS\n");
		for (Equipamento equipamentos : equipamento) {
			System.out.println("Nome: " + equipamentos.getNome() + " Quantidade: " + equipamentos.getQuantidade()
					+ " Total R$: " + equipamentos.getValorUnidade() + "\n");
		}
		if (equipamento.isEmpty()) {
			System.out.println("Nenhum equipamento foi cadastrado.");
		}
	}

	private static void addEquipamento(Scanner t) {
		System.out.println("----------------------");
		System.out.println("CADASTRAR EQUIPAMENTO\n");
		System.out.println("Digite o nome do equipamento: ");
		String nome = t.next().trim();
		System.out.println("Digite a quantidade: ");
		int quantidade = t.nextInt();
		System.out.println("Digite o valor de custo: ");
		float custo = t.nextFloat();
		equipamento.add(new Equipamento(nome, quantidade, custo));
		System.out.println("Adicionado com sucesso!");

	}

	private static void retiraQuantidade(Scanner t) {
		System.out.println("Digite o nome do equipamento: ");
		String nome = t.next().trim();
		for (Equipamento equipamentos : equipamento) {
			if (equipamentos.getNome().equals(nome)) {
				System.out.println("Digite a quantidade: ");
				int quantidade = t.nextInt();
				equipamentos.remover(quantidade);
				System.out.println("Removido com sucesso!");
			} else {
				System.out.println("Equipamento nao encontrado");
				break;
			}
		}
	}

	private static void addQuantidade(Scanner t) {
		System.out.println("Digite o nome do equipamento: ");
		String nome = t.next().trim();
		for (Equipamento equipamentos : equipamento) {
			if (equipamentos.getNome().equals(nome)) {
				System.out.println("Digite a quantidade: ");
				int quantidade = t.nextInt();
				equipamentos.add(quantidade);
				System.out.println("Adicionado com sucesso!");
			} else {
				System.out.println("Equipamento nao encontrado!");
				break;
			}
		}
	}

	private static void removerEquipamento(Scanner t) {
		boolean achou = false;
		System.out.println("Digite o Nome do Equipamento para Excluir: ");
		String remover = t.next().trim();
		for (int i = 0; i < equipamento.size(); i++) {
			if (equipamento.get(i).getNome().equals(remover)) {
				equipamento.remove(i);
				achou = true;
			}
		}
		if (achou == true) {
			System.out.println("\nExcluido com sucesso!");
		} else {
			System.out.println("\nEquipamento nao encontrado!");
		}
	}

	private static void imprimeFornecedor() {
		System.out.println("------------------------------");
		System.out.println("\nFORNECEDORES CADASTRADOS\n");
		for (int indFor = 0; indFor < listaFornecedor.size(); indFor++) {
			System.out.print("Fornecedor " + indFor + ": ");
			imprimePessoa(listaFornecedor.get(indFor));
			System.out.println(" Inscricao Estadual: " + listaFornecedor.get(indFor).getInscEstadual());
		}
		if (listaFornecedor.isEmpty()) {
			System.out.println("Nenhum fornecedor foi cadastrado.");
		}
	}

	private static void editaFornecedor(Scanner t) {
		boolean achou = false;
		System.out.println("\nDigite o nome do Fornecedor que deseja Alterar:");
		String nome = t.next().trim();
		for (int i = 0; i < listaFornecedor.size(); i++) {
			if (listaFornecedor.get(i).getNome().equals(nome)) {
				System.out.println("\nDigite o novo nome que deseja incluir:");
				String novo = t.next().trim();
				listaFornecedor.get(i).setNome(novo);
				achou = true;
			}
		}
		if (achou == true) {
			System.out.println("\nEditado com sucesso!");
		} else {
			System.out.println("\nFornecedor nao encontrado!");
		}
	}

	private static void removeFornecedor(Scanner t) {
		boolean achou = false;
		System.out.println("\nDigite o Nome do Fornecedor para Excluir: ");
		String remover = t.next().trim();
		for (int i = 0; i < listaFornecedor.size(); i++) {
			if (listaFornecedor.get(i).getNome().equals(remover)) {
				listaFornecedor.remove(i);
				achou = true;
			}
		}
		if (achou == true) {
			System.out.println("\nExcluido com sucesso!");
		} else {
			System.out.println("\nFornecedor nao encontrado!");
		}
	}
}