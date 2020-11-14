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

		System.out.println("Bem vindo(a) ao Health Track! Fa�a o seu cadastro.\n");

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
			System.out.println("\n\n    #### Escolha uma op��o do menu ####");
			System.out.println("    +==================================+");
			System.out.println("    |     1 - Inserir Exercicio        |");
			System.out.println("    |     2 - Inserir Dieta            |");
			System.out.println("    |     3 - Inserir Pressao Arterial |");
			System.out.println("    |     4 - Recomenda��o Dieta       |");
			System.out.println("    |     5 - Recomenda��o Exercicio   |");
			System.out.println("    |     6 - Ver Perfil               |");
			System.out.println("    |     7 - Hist�rico Dieta          |");
			System.out.println("    |     8 - Hist�rico Exercicio      |");
			System.out.println("    |     9 - Hist�rico Press�o        |");
			System.out.println("    |     10 - Resumo Semanal          |");
			System.out.println("    |     0 - Sair                     |");
			System.out.println("    +==================================+\n");

			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("#### CADASTRO DE EXERICICIOS ####\n");

				System.out.println("Qual exercicio voc� fez? Exemplo: abdominais, agachamento.");
				scanner.nextLine();
				exercicio.setNomeExercicio(scanner.nextLine());

				System.out.println("Quantas repeti��es voc� fez?");
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
						+ " com " + exercicio.getRepeticao() + " repeti��es em cada serie!");
				System.out.println("   -Voc� perdeu " + exercicio.getGorduraExercicio() + " Gramas de gordura!");
				System.out.println("   -Voc� queimou " + exercicio.getCaloriaExercicio() + " Kcal!");
				System.out.println("   -Voc� ganhou " + exercicio.getMassaExercicio() + " Gramas de massa muscular!");
				
				
				exercicioData.gravar(exercicio);
				
				

			

				break;
			case 2:
				System.out.println("#### CADASTRO DE ALIMENTOS ####\n");

				System.out.println("Qual alimento voc� consumiu?");
				scanner.nextLine();
				dieta.setAlimento(scanner.nextLine());

				System.out.println("Quantas gramas?");
				dieta.setQuantidade(scanner.nextInt());

				System.out.println("Quantas por��es?");
				dieta.setPorcoes(scanner.nextInt());

				dieta.calcCaloriaGanha();
				dieta.calcGorduraGanha();
				dieta.calcProteinaGanha();
				dieta.calcQuantidade();
				dieta.calcCaloriaDieta();
				dieta.calcGorduraDieta();
				dieta.calcProteinaDieta();

				System.out.println("   -Voc� consumiu " + dieta.getQuantidade() + " Gramas de " + dieta.getAlimento());
				System.out.println("   -Voc� consumiu " + dieta.getCaloriaAlimento() + " Kcal");
				System.out.println("   -Voc� consimiu " + dieta.getProteinaAlimento() + " gramas de Proteina");
				System.out.println("   -Voc� ganhou " + dieta.getGorduraGanhaDieta() + " gramas de Gordura");
				
				
				dietaData.gravar(dieta);

		

				break;
			case 3:
			
				System.out.println("Insira sua pressao arterial, Exemplo: 12x5.");
				pressao.setPressao(scanner.next());
				
				pressaoData.gravar(pressao);
				break;
			case 4:
				
			
				System.out.println("#### RECOMENDA��ES DE DIETAS ####\n");
				System.out.println(dicaDieta.recomendacaoDieta(usuario));

				break;
			case 5:
				
				
				System.out.println("#### RECOMENDA��ES DE TREINOS ####\n");
				System.out.println(treino.recomendacaoTreino(usuario));

				break;
			case 6:
				progresso.calcPesoEstimado(usuario, dieta, exercicio);
				progresso.calcGramaPeso(usuario, dieta, exercicio);
				usuario.calculoImc(progresso);
				
				

				System.out.println("+========================PERFIL=================================+\n");
				System.out.println("  Ol� " + usuario.getNome());
				System.out.println("  Sua altura: " + usuario.getAltura());
				System.out.println("  Peso inicial: " + usuario.getPeso());
				System.out.println("  Seu peso atual estimado � "
						+ inteiro.format(progresso.getPesoEstimadoQuilo()) + "kg e "
						+ inteiro.format(progresso.getPesoEstimadoGrama()) + "g");
				System.out.println("  IMC: " + decimal.format(usuario.getImc()));
				System.out.println("  Sua ultima press�o registrada foi de "+pressao.getPressao()+"\n");
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
				System.out.println("   -Voc� ganhou " + exercicio.getMassa() + " Gramas de massa muscular!");
				System.out.println("   -Voc� perdeu " + exercicio.getGordura() + " Gramas de gordura!");
				System.out.println("   -Voc� consumiu " + dieta.getCaloria() + " Kcal");
				System.out.println("   -Voc� ganhou " + dieta.getGordura() + " gramas de Gordura");
				System.out.println("   -Voc� consumiu " + dieta.getProteina() + " gramas de Proteina");
				
				break;
			case 0:
				break;
			default:
				System.out.println("Op��o Inv�lida!");

				break;
			}
		} while (opcao != 0);
	}

}
