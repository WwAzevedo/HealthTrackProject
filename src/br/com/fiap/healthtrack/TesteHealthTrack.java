package br.com.fiap.healthtrack;


import java.text.DecimalFormat;
import java.util.Scanner;


import br.com.fiap.dao.DietaDAO;
import br.com.fiap.dao.ExercicioDAO;
import br.com.fiap.dao.PressaoArterialDAO;
import br.com.fiap.dao.UsuarioDAO;

public class TesteHealthTrack {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat inteiro = new DecimalFormat("00");
		DecimalFormat decimal = new DecimalFormat("00.00");

		Usuario usuario = new Usuario();
		Progresso progresso = new Progresso();
		Exercicio exercicio = new Exercicio();
		Dieta dieta = new Dieta();
		RecomendacaoTreino treino = new RecomendacaoTreino();
		RecomendacaoDieta dicaDieta = new RecomendacaoDieta();
		PressaoArterial pressao = new PressaoArterial();
		
		
		ExercicioDAO exercicioData = new ExercicioDAO();
		DietaDAO dietaData = new DietaDAO();
		PressaoArterialDAO pressaoData = new PressaoArterialDAO();
		UsuarioDAO usuarioData = new UsuarioDAO();

		// Cadastro

		System.out.println("Bem vindo(a) ao Health Track! Faça o seu cadastro.\n");

		System.out.println("Insira o seu nome:");
		usuario.setNome(scanner.nextLine());

		System.out.println("Insira seu peso:");
		usuario.setPeso(scanner.nextDouble());

		System.out.println("Insira sua altura:");
		usuario.setAltura(scanner.nextDouble());
		
		
		//usuario.calculoImc(progresso);
		//usuarioData.gravar(usuario);
		

		int opcao = 0;
		do {
			System.out.println("\n\n    #### Escolha uma opção do menu ####");
			System.out.println("    +==================================+");
			System.out.println("    |     1 - Inserir Exercicio        |");
			System.out.println("    |     2 - Inserir Dieta            |");
			System.out.println("    |     3 - Inserir Pressao Arterial |");
			System.out.println("    |     4 - Recomendação Dieta       |");
			System.out.println("    |     5 - Recomendação Exercicio   |");
			System.out.println("    |     6 - Ver Perfil               |");
			System.out.println("    |     7 - Histórico Dieta          |");
			System.out.println("    |     8 - Histórico Exercicio      |");
			System.out.println("    |     9 - Histórico Pressão        |");
			System.out.println("    |     10 - Resumo Semanal          |");
			System.out.println("    |     0 - Sair                     |");
			System.out.println("    +==================================+\n");

			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("#### CADASTRO DE EXERICICIOS ####\n");

				System.out.println("Qual exercicio você fez? Exemplo: abdominais, agachamento.");
				scanner.nextLine();
				exercicio.setNomeExercicio(scanner.nextLine());

				System.out.println("Quantas repetições você fez?");
				exercicio.setRepeticao(scanner.nextInt());

				System.out.println("Quantas series?");
				exercicio.setSerie(scanner.nextInt());
				
				
				exercicio.calcCaloriaPerdida();
				exercicio.calcMassaMuscular();
				exercicio.calcGorduraPerdida();
				exercicio.calcCaloriaExercicio();
				exercicio.calcMassaExercicio();
				exercicio.calcGorduraExercicio();

				System.out.println("   -Voce fez " + exercicio.getSerie() + " series de " + exercicio.getNomeExercicio()
						+ " com " + exercicio.getRepeticao() + " repetições em cada serie!");
				System.out.println("   -Você perdeu " + exercicio.getGorduraExercicio() + " Gramas de gordura!");
				System.out.println("   -Você queimou " + exercicio.getCaloriaExercicio() + " Kcal!");
				System.out.println("   -Você ganhou " + exercicio.getMassaExercicio() + " Gramas de massa muscular!");
				
				
				exercicioData.gravar(exercicio);
				
				

			

				break;
			case 2:
				System.out.println("#### CADASTRO DE ALIMENTOS ####\n");

				System.out.println("Qual alimento você consumiu?");
				scanner.nextLine();
				dieta.setAlimento(scanner.nextLine());

				System.out.println("Quantas gramas?");
				dieta.setQuantidade(scanner.nextInt());

				System.out.println("Quantas porções?");
				dieta.setPorcoes(scanner.nextInt());

				dieta.calcCaloriaGanha();
				dieta.calcGorduraGanha();
				dieta.calcProteinaGanha();
				dieta.calcQuantidade();
				dieta.calcCaloriaDieta();
				dieta.calcGorduraDieta();
				dieta.calcProteinaDieta();

				System.out.println("   -Você consumiu " + dieta.getQuantidade() + " Gramas de " + dieta.getAlimento());
				System.out.println("   -Você consumiu " + dieta.getCaloriaAlimento() + " Kcal");
				System.out.println("   -Você consimiu " + dieta.getProteinaAlimento() + " gramas de Proteina");
				System.out.println("   -Você ganhou " + dieta.getGorduraGanhaDieta() + " gramas de Gordura");
				
				
				dietaData.gravar(dieta);

		

				break;
			case 3:
			
				System.out.println("Insira sua pressao arterial, Exemplo: 12x5.");
				pressao.setPressao(scanner.next());
				
				pressaoData.gravar(pressao);
				break;
			case 4:
				
			
				System.out.println("#### RECOMENDAÇÕES DE DIETAS ####\n");
				System.out.println(dicaDieta.recomendacaoDieta(usuario));

				break;
			case 5:
				
				
				System.out.println("#### RECOMENDAÇÕES DE TREINOS ####\n");
				System.out.println(treino.recomendacaoTreino(usuario));

				break;
			case 6:
				progresso.calcPesoEstimado(usuario, dieta, exercicio);
				progresso.calcGramaPeso(usuario, dieta, exercicio);
				usuario.calculoImc(progresso);
				
				

				System.out.println("+========================PERFIL=================================+\n");
				System.out.println("  Olá " + usuario.getNome());
				System.out.println("  Sua altura: " + usuario.getAltura());
				System.out.println("  Peso inicial: " + usuario.getPeso());
				System.out.println("  Seu peso atual estimado é "
						+ inteiro.format(progresso.getPesoEstimadoQuilo()) + "kg e "
						+ inteiro.format(progresso.getPesoEstimadoGrama()) + "g");
				System.out.println("  IMC: " + decimal.format(usuario.getImc()));
				System.out.println("  Sua ultima pressão registrada foi de "+pressao.getPressao()+"\n");
				System.out.println(usuario.tabelaImc());

				
				break;
			case 7:
				dietaData.buscarTodos();
				break;
			case 8:
				exercicioData.buscarTodos();
				break;
			case 9:
				pressaoData.buscarTodos();
				break;
			case 10:
				System.out.println("+======================RELATORIO SEMANAL=========================+\n");
				System.out.println("   -Você ganhou " + exercicio.getMassa() + " Gramas de massa muscular!");
				System.out.println("   -Você perdeu " + exercicio.getGordura() + " Gramas de gordura!");
				System.out.println("   -Você consumiu " + dieta.getCaloria() + " Kcal");
				System.out.println("   -Você ganhou " + dieta.getGordura() + " gramas de Gordura");
				System.out.println("   -Você consumiu " + dieta.getProteina() + " gramas de Proteina");
				
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");

				break;
			}
		} while (opcao != 0);
	}

}
