/*
 * @author Wesley Azevedo
 * @version 1.0
 */

package br.com.fiap.healthtrack;


public class RecomendacaoTreino extends Exercicio {


	// Construtores
	public RecomendacaoTreino() {

	}

	public RecomendacaoTreino(int exercicioID, String nomeExercicio, int repeticao, int serie, int massa, int gordura, int caloria,
			int proteina) {
		super();
	}

	Usuario usuario;
	public RecomendacaoTreino(Usuario usuario) {
		this.usuario = usuario;
	}

	// Metodos
	public String recomendacaoTreino(Usuario usuario) {
		if (usuario.getImc() < 18.49) {
			System.out.println(
					"Voc� est� um pouco abaixo do peso!\nMais isso n�o � algo ruim, ter uma baixa porcentagem de gordura significa que voc� pode definir o seu corpo de forma mais rapida do que pessoas que est�o acima do peso por exemplo.\nA muscula��o vai ser sua maior aliada nesse processo, ajudando voc� a ganhar bastante massa muscular, mas isso s� � possivel com um equilibrio entre treino e dieta. ");
			System.out.println(
					"Nesse aritigo vamos te ensinar como montar uma boa escala de treinos para Hipertrofia: https://www.elhombre.com.br/como-montar-um-treino-de-hipertrofia-ideal/");

		} else if (usuario.getImc() >= 18.50 && usuario.getImc() <= 24.99) {
			System.out.println(
					"Parab�ns! Voc� est� com o seu peso ideal.\nO objetivo agora � manter a porcentagem de gordura baixa e continuar com treinos moderados para o ganho de massa muscular.");
			System.out.println(
					"Nesse aritigo vamos te mostrar algumas praticas para manter o seu peso:https://exame.com/casual/5-exercicios-para-um-corpo-mais-saudavel-segundo-harvard/");

		} else {
			System.out.println(
					"Voc� est� um pouco acima do peso! \nMas n�o se preocupe, com exercicios corretos e uma dieta equilibrada voc� pode retornar para o seu peso ideal e ter uma vida mais saudavel.\nExercicios aerobicos ser�o grandes aliados para a redu��o de gordura. Andar, correr, nadar, pedalar, dan�ar, s�o alguns dos principais exemplos de exerc�cios aer�bicos.");
			System.out.println(
					"Nesse artigo vamos te mostrar alguns exercicios que voc� fazer para perder peso: https://gooutside.com.br/exercicios-aerobicos-para-desempenho-2/");

		}
		return "";

	}

}
